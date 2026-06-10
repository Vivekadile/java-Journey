import java.util.LinkedList;
public class linkedlist {
    private Node head;

    private class Node
    {
        int data;
        Node next;
       
        Node (int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    linkedlist()
    {
        head =null;

    }
    public boolean isnull()
    {
        return (head==null);
    }
    Node createlist(int[] Values)
    {

        head=new Node(Values[0]);
        Node current=head;
        for(int i=1;i<Values.length;i++)
        {
            current.next=new Node(Values[i]);
            current=current.next;

        }
        return head;
    }
    public void display()
    {
        
        if(head==null)
        {
            System.out.println("Empty");
            return;
        }
        Node current=head;
        System.out.println("head->");
        while (current!=null)
        {
            System.out.print(current.data);
            if (current!=null)
            {
                System.out.print("->");
            }
            current=current.next;

        }
        System.out.println("Null");
    }
    public static void main(String[] args)
    {
        int[] values1 = {10,20,30,40};
        int[] values2 = {78,70,40,9,9};

        linkedlist list1 = new linkedlist();
        linkedlist list2 = new linkedlist();

        Node head1=list1.createlist(values1);
        Node head2=list2.createlist(values2);
        
        head1.display();
        list2.display();
    }
}
