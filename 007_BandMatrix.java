//save file as BandMatrix.java
// syntax example :
// java BandMatrix.java 5 1
public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // Dimension of the grid
        int width = Integer.parseInt(args[1]); // Width of the band around the diagonal
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= width) {
                    System.out.print("*  ");
                } else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }
}
