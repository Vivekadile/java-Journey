public class Recursive_sum {
    public static void main(String[] args) {
        System.out.println(p(5));
    }

    public static int p(int n) {
        if (n == 0) {
            return 0;
        }

        return n + p(n - 1);
    }
}