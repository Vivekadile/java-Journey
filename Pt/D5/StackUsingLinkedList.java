public class StackUsingLinkedList {

    private Node head;
    private int size;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public StackUsingLinkedList() {
        head = null;
        size = 0;
    }

   
    public void push(int element) {
        Node newNode = new Node(element);

        newNode.next = head;
        head = newNode;

        size++;

        System.out.println("Element added: " + element);
    }

    
    public int pop() {

        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        int popped = head.data;
        head = head.next;

        size--;

        return popped;
    }

    
    public int peek() {

        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        return head.data;
    }

    
    public boolean isEmpty() {
        return head == null;
    }

   
    public int size() {
        return size;
    }

    
    public void display() {

        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("TOP -> ");

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Peek = " + stack.peek());

        System.out.println("Pop = " + stack.pop());

        stack.display();

        System.out.println("Size = " + stack.size());
    }
}