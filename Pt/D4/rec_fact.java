public class rec_fact {
     public static void main(String[] args) {
        System.out.println(p(5));
    }

    public static int p(int n) {
        if (n == 1) {
            return 1;
        }

        return n * p(n - 1);
    }
    
}
