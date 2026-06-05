import java.util.*;

public class charlinear {

    public static void main(String[] args) {

        char[] c = {'a', 'b', 'c', 'd'};

        System.out.println(contains(c, 'c'));
    }

    public static boolean contains(char[] c, char target) {

        for (int i = 0; i < c.length; i++) {
            if (c[i] == target) {
                return true;
            }
        }

        return false;
    }
}