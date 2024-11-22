// prints true or false when entering 3 integers / arguments 
// returns true if the sides are ints and make a right triangle

public class RightTriangle {
    public static void main(String[] args) {

                //checks if exactly 3 arguments are used
                if (args.length != 3) {
                    System.out.println("false");
                    return;
                }

                // checks if the args are actually integers instead of text
                if (!isInteger(args[0]) || !isInteger(args[1]) || !isInteger(args[2])) {
                    System.out.println("false");
                    return;
                }

                //converts arguments into integers for sure 
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                int c = Integer.parseInt(args[2]);

                // Check if all integers are positive
                if (a <= 0 || b <= 0 || c <= 0) {
                    System.out.println("false");
                    return;
                }

                // Check if they satisfy the Pythagorean theorem
                if (isRightTriangle(a, b, c)) {
                    System.out.println("true");
                } 
                else {
                    System.out.println("false");
                }
    }  //end main

        

    // Method to check if the sides form a right triangle
    public static boolean isRightTriangle(int a, int b, int c) {
        // Sort the sides so that c is the largest
        int[] sides = {a, b, c};
        java.util.Arrays.sort(sides);

        return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];
    }

    //function to prevent errors if you enter names instead of ints
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }



}
