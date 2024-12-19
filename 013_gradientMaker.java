import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GradientImageSaver {

    public static void main(String[] args) {
        // Image dimensions (2K x 2K)
        int width = 2000;
        int height = 2000;

        // Create a BufferedImage to store the gradient
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = image.createGraphics();

        // Hue set to 0.5 (Green hue)
        float hue = 0.5f;

        // Draw the gradient
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // Saturation is based on the x position (left to right)
                float saturation = (float) x / width;

                // Brightness is based on the y position (top to bottom)
                // Top is white (brightness = 1), bottom is black (brightness = 0)
                float brightness = 1.0f - (float) y / height;

                // Get the color based on HSB values
                Color color = Color.getHSBColor(hue, saturation, brightness);

                // Set the pixel color
                image.setRGB(x, y, color.getRGB());
            }
        }

        // Save the generated image as a PNG file
        File file = new File("gradient_2.png");
        try {
            ImageIO.write(image, "PNG", file);
            System.out.println("Image saved as gradient.png");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Clean up graphics resources
        graphics.dispose();
    }
}
