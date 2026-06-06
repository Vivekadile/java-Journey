public class Recursionsum {
    public static void main(String[] args) 
    {
        rp(5);
    }

    public static void p(int n)
    {
        if(n==0)
        {
            return ;
        }
        p(n-1);
        System.out.println(n);
    }
    public static void rp(int n)
    {
        if(n==0)
        {
            return ;
        }
        System.out.println(n);
        rp(n-1);
        
    }
    
}
