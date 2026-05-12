package Basics;

public class couting_lines {
    public static void main(String[] args){
        String str = "Hello World\nWelcome to Java Programming\nThis is a counting lines example";
        int lineCount = str.split("\n").length;
        for (int i = 1; i <= lineCount; i++) {
            
        }
       
        System.out.println("Number of lines: " + lineCount);
    }
    
}
