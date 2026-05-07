package Basics;
import java.util.*;

public class conditons {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the markrs");

        int marks= sc.nextInt();
        System.out.println("You entered: " + marks);

        if (marks<40){
            System.out.println("failed");

        }
        else if (marks<=80){
            System.out.println("passed");

        }
        else if (marks<=100){
            System.out.println("distinction");
        }
        else{
            System.out.println("invalid marks");
        }

    }
}