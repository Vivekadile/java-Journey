//Given an integer, , perform the following conditional actions:

//If  is odd, print Weird
//If  is even and in the inclusive range of  2to5, print Not Weird
//If  is even and in the inclusive range of  6to20, print Weird
//If  is even and greater than 20, print Not Weird
package Basics;
import java.util.*;
public class conditions_1 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        if (n % 2 == 1) {
            System.out.println("Weird");
        }
        else if(n>2 && n<=5){
            System.out.println("Not weird");
        }
        else if (n%2==0 && n>=6 && n<=20){
            System.out.println("Weird");
        }
        else {
            System.out.println("Not weird");
        }
    }
}
