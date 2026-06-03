package Pt.d1;


public class bool {
    public static void main(String[] args) {
        int age = 19;
        boolean isAdult=(age>=18);
        boolean hasliscense=true;
        boolean canDrive=(isAdult && hasliscense);
        System.out.println(canDrive);
    }
    
}
