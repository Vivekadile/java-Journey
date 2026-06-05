import java.util.*;

public class arrlin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 24, 56, 74, 56, 34, 23, 56};

        System.out.print("enter the number to search: ");
        int key = sc.nextInt();

        int r = linear_search(arr, key);
        int br=linear_search_back(arr, key);
        if (r == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index from back " + br);
        }



        if (r == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index " + r);
        }

        sc.close();
    }

    public static int linear_search(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {

            if (key == arr[i]) {
                return i;
            }

        }

        return -1;
    }
    public static int linear_search_back(int[] arr, int key) {

        for (int i = arr.length; i < 0; i--) {

            if (key == arr[i]) {
                return i;
            }

        }

        return -1;
    }

}