import java.util.*;

public class linear {
        
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            String[] fruit={"Apple","banana","cherry"};
            String key=sc.nextLine();
            int r=linear_search(fruit,key);


            if (r==-1)
            {
                System.out.println("Not found");
            }
            else{
                System.out.println("Found at "+r );
            }


            
        
    }

    public static int linear_search(String[] arr, String key){

        for (int i = 0; i < arr.length; i++) 
        {
        if (arr[i].equals(key)) 
            {
                return i;
            }
        }

        return -1;


    }
    
}
