import java.util.ArrayList;

import java.util.*;
import java.util.Collection;
public class dynamic_array {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(2,0);
        list.add(20);
        list.add(10);
        list.add(4,20);
        System.out.println("the array is "+list);
        System.out.println(list.get(4));
        
    }


    
}
