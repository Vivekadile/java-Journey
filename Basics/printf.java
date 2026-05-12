package Basics;

import java.util.Scanner;

public class printf {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.print(s1);
                int k=s1.length();
                for (int j=k; j<15; j++){
                    System.out.print(" ");
                }
                int c=String.valueOf(x).length();
                if (c<3){
                    for (int l=0; l<3-c;l++)
                    {
                        System.out.print("0");
                    }
                }
                System.out.println(x);
                
                
                //Complete this line

            }
            System.out.println("================================");
            
    }

}
