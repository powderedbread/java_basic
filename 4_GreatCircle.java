
//finds distance between two points on a sphere in kilometers according to specific earth radius
//format run command like java GreatCircle 40.35 74.65 48.87 -2.33
// where each number is x1, y1, x2, y2  in lattitude and longitude degrees
public class GreatCircle 
{
        public static void main(String[] args)
        {
                if (args.length !=4)
                {
                        System.out.println("Error: please provide exactly 4 numerical arguments");
                        return;
                }
        
                try
                {
                    double x1 = Double.parseDouble(args[0]);
                    double y1= Double.parseDouble(args[1]);
                    double x2 = Double.parseDouble(args[2]);
                    double y2 = Double.parseDouble(args[3]);

                    double distance = haversine(x1, y1, x2, y2);
                    System.out.printf("%.12f kilometers\n", distance);

                }
                catch (NumberFormatException e)
                {
                 System.out.println("All arguments must be valid numeric values");
                }
        
        } //end main
        public static double haversine(double lat1, double lon1, double lat2, double lon2) 
        {
            final double R = 6371.0;
            double radLat1 = Math.toRadians(lat1);
            double radLon1 = Math.toRadians(lon1);
            double radLat2 = Math.toRadians(lat2);
            double radLon2 = Math.toRadians(lon2);

            double deltaLat = radLat2 - radLat1;
            double deltaLon = radLon2 - radLon1;
            
            //actual formula
            double result = 2*R*Math.asin(
                Math.sqrt(
                Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2) +
                   Math.cos(radLat1) * 
                   Math.cos(radLat2) *
                   Math.sin(deltaLon / 2) * Math.sin(deltaLon / 2)
                   )
                   );

            return result;

        }



}
