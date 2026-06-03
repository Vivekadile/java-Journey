import java.util.*;

public class greet {
    public static String greet(String s) 
    {
        
        return "Hello good morning " +s;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");

        String name = sc.nextLine();

        greet(name);


    }
    
}
