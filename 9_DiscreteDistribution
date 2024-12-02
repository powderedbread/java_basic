public class DiscreteDistribution 
{
    public static void main(String[] args) 
    {
     
        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) 
        {
            a[i] = Integer.parseInt(args[i + 1]);
        }

        int[] cumulativeSums = new int[n + 1];
        cumulativeSums[0] = 0;

        for (int i = 0; i < n; i++) {
            cumulativeSums[i + 1] = cumulativeSums[i] + a[i];
        }

        
        for (int j = 0; j < m; j++) 
        {
         
            int r = (int) (Math.random() * cumulativeSums[n]);
            int index = 1;
            for (int i = 1; i <= n; i++) 
            {
                if (r < cumulativeSums[i]) 
                {
                    index = i;
                    break;
                }
            }

 
            System.out.print(index + " ");
        }
        System.out.println();
    }
}
