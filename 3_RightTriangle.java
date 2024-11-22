public class RightTriangle 
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int aa = Math.min(a, Math.max(b,c));
        int cc = Math.max(a,Math.max(b,c));
        int bb= a + b + c - aa - cc;
        boolean result = (aa > 0 && bb > 0 && cc > 0) && (aa * aa + bb * bb == cc * cc);
        System.out.println(result) ;

    }


}  


