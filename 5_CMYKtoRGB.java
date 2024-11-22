//syntax java CMYKtoRGB 0.0 1.0 0.0 0.0 

public class CMYKtoRGB {
    public static void main(String[] args) {
     
            double cyan = Double.parseDouble(args[0]);
            double magenta = Double.parseDouble(args[1]);
            double yellow = Double.parseDouble(args[2]);
            double black = Double.parseDouble(args[3]);

            // Calculate the white component
            double white = 1 - black;

            // Calculate RGB components
            int red = (int)Math.round (255 * white * (1 - cyan));
            int green = (int)Math.round (255 * white * (1 - magenta));
            int blue = (int)Math.round (255 * white * (1 - yellow));

            // Output the RGB values
            System.out.println("red   = " + red);
            System.out.println("green = " + green);
            System.out.println("blue  = " + blue);
        } 
        
    }

