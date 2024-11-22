public class RightTriangle{
    public static void main(String[] args) {


                //converts arguments into integers for sure 
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                int c = Integer.parseInt(args[2]);

                int smallest = Math.min(a, Math.max(b,c));
                int largest = Math.max(a,Math.min(b,c));
                int middle= a+b+c -largest - smallest;

                System.out.println(smallest * smallest + middle * middle == largest * largest) ;

                }


    }  //end main


