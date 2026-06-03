import java.util.*;
public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[]= new int[n];
        int i=0;

        while(i<n)
        {
            System.out.printf("Enter the %d element in th array",i);
            a[i]=sc.nextInt();
            i++;

        }
        int j=0;

        while(j<n)
        {
            System.out.println(a[j]);
            j++;
            

        }

        
    }
    
}
