public class febonacci {
    public static void main(String[] args) {
        int n=7;
        int f=0 , s=1;

        for (int i=2; i<n; i++)
        {
            int nt= f+s;
            f=s;
            s=nt;



        }
        System.out.println(s);
    }
    
}
