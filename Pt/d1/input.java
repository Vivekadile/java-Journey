package Pt.d1;
//Reading the mixed types

import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age ");
        int a=sc.nextInt();
        System.out.println("Enter the salaries  ");
        double b=sc.nextDouble();
        System.out.printf("Age : %d, salary: $%.2f%n",a , b);
        sc.close();
        ///bhaiya yaha pe hum alaga alg type ke variable input leke print larwa rahe hai 
        
        
    }
    
}
