import java.util.*;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        int i=1;
        int m;
        
        while(i<=20)
        {
            m=n*i;
            System.out.printf("%d  * %d = %d \n",n,i,m);
            i++;
        }
        

    }
    
}
