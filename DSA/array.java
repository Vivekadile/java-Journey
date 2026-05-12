package DSA;
import java.util.*;

public class array {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum=0, count=0,max=-99;
        System.out.println("enter the numbers"+n+" in array ");


        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            

        } 
        System.out.println("1.the array is :-");
        

        for (int i=0;i<n;i++){
            System.out.println(a[i]);
            sum=sum+a[i];
            count+=1;
            if (a[i]>max){
                max=a[i];
            }
            

        } 
        System.out.println("4.Array in reverse order");
         for (int i=n;i<0;i--){
            System.out.println(a[i]);
            
            

        } 


        System.out.println("2.Sum is "+sum);
        System.out.println("3.number of elements in"+count);
        System.out.println("4.max number is "+max);
        System.out.println("5.Array in reverse order");
         for (int i=n;i<0;i--){
            System.out.println(a[i]);
            
            

        } 



    }
    
}
