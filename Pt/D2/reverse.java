import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int rn=0;
        int cp=n;
        while(cp!=0)
        {
            int r = n%10;
            rn=rn*10+r;
            n=n/10;

        }

        System.out.println(rn);
        sc.close();
        
    }
    
}
