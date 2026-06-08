import java.util.ArrayList;
import java.util.*;

public class StackUsingArray {

    ArrayList<Integer> list;

    public StackUsingArray() {
        list = new ArrayList<>();
    }

    public void push(int element) {
        list.add(element);
        
    }

    public int pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return list.remove(list.size() - 1);
    }

    public int peek() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void display() {

        if (list.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack (Top -> Bottom)");

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {

        StackUsingArray stack = new StackUsingArray();

        stack.push(10);
        stack.push(79);
        stack.push(50);

        stack.display();

        System.out.println("Peek = " + stack.peek());

        System.out.println("Pop = " + stack.pop());

        stack.display();
    }
}