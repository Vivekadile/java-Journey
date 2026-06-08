import java.util.*;
public class dynamic_array {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(99);
        list.add(27);
        list.add(2,8);//bhai yaha pe hum index vise elemnets add kar sakte hai 
        list.add(56);
        list.add(0);
        list.add(0,0);
        System.out.println("the array is "+list);
        System.out.println(list.get(4));

        System.out.println("Updating the lements ");
        list.set(3,99);
        System.out.println(list);

        System.out.println("the last element");
        System.out.println(list.get(list.size()-1));

        System.out.println("Removing element");
        System.out.println(list.remove(3));

        System.out.println("printing the index");
        System.out.println(list.indexOf(0));


        System.out.println("printing the contain ");
        System.out.println(list.contains(20));


        System.out.println("Is this list is empty ");
        System.out.println(list.isEmpty());

        System.out.println("the array" );

        

        int i=0;
        while (i<list.size())
        {
            System.out.println(list.get(i));
            i++;
        }

        System.out.println("reevrsing the array" );



        int j=list.size()-1;
        while (j>=0)
        {
            System.out.println(list.get(j));
            j--;
        }

        Collections.sort(list);

        System.out.println("Sorting done here \n "+list);


        Collections.sort(list,Collections.reverseOrder());

        System.out.println("Sorting descendin \n "+list);


        
        
    }


    
}
