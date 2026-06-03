public class factorial {
    public static int fac(int n) {
        int results=1;
        for (int i=1; i<=n;i++)
        {
            results=results *i;

        }
        return results;

        
    }
    public static void main(String[] args) {

        int  a=fac(5);
        System.out.println(a);

        
    }
    
}
