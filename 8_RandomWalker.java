// save as RandomWalker.java
// syntax:
// java RandomWalker.java 5
public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]); // Read the Manhattan distance target
        int x = 0, y = 0; // Starting coordinates
        int steps = 0; // Step counter

        System.out.println("(" + x + ", " + y + ")");

        while (Math.abs(x) + Math.abs(y) < r) {
            int direction = (int) (Math.random() * 4); // Generate a direction between 0 and 3

            switch (direction) {
                case 0: y += 1; break; // Move up
                case 1: y -= 1; break; // Move down
                case 2: x -= 1; break; // Move left
                case 3: x += 1; break; // Move right
            }

            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }

        System.out.println("steps = " + steps);
    }
}
