package Basics;

public class methods {
    public static void s(){
        System.out.println("Hello Vivek ");

    }
    public static void m(int a ,int b){
        int sum=a+b;
        System.out.println("The sum is "+sum );


    }
    public static int greater(int a ,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        s();
        m(56,44);
        int result=greater(56,44);
        System.out.println("The greater number is "+result);
    }

    
}
