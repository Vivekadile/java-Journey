import java.util.*;
public class if_else {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks");
        int a=sc.nextInt();
        if (a >= 100 || a<=0 )
        {
            System.out.println("Invalid input");

        }
        else
        {
            if (a >= 90 )
            {
                System.out.println("Grade a");

            }
            else if(a >= 80 )
            {
                System.out.println("Grade a");

            }
            else if(a >= 70 )
            {
                System.out.println("Grade b");

            }
            else
            {
                System.out.println("Fail");
            }

        }
        sc.close();

    }
}
