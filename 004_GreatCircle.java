
public class GreatCircle 
{
    public static void main(String[] args)
    {


        double x1 = Double.parseDouble(args[0]);
        double y1= Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double R = 6371.0;

        double xx1 = Math.toRadians(x1);
        double yy1 = Math.toRadians(y1);
        double xx2 = Math.toRadians(x2);
        double yy2 = Math.toRadians(y2);


        double result = 2*R*Math.asin(
            Math.sqrt(
            Math.sin( (xx2 - xx1) / 2) * Math.sin( (xx2 - xx1) / 2) +
            Math.cos(xx1) * 
            Math.cos(xx2) *
            Math.sin( (yy2 - yy1) / 2) * Math.sin( (yy2 - yy1) / 2) 
            )
            );

        
        System.out.printf(result + " kilometers");
        
    } 
  
}
