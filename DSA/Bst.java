import java.util.Stack;
public class Bst {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    void createtree() {
        root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.right = new Node(2);
        root.right.left = new Node(3);

        System.out.println("Tree created bhai");
    }
    void displayDFS(Node node)
    {
        if(node==null)
        {
            return ;
        }

        displayDFS(node.left);
        System.out.println(" "+node.data);

        displayDFS(node.right);
    }

    int find_length(Node node)
    {
        if(node==null)
        {
            return 0;
            
        }
        int lh=find_length(node.left);
        int rh=find_length(node.right);
        return Math.max(lh,rh)+1;
    }

    void inorderIteration()
    {
        Stack<Node> stack= new Stack<>();
        Node current=root;
        while(current !=null || stack.isEmpty())
        {
            while(current!=null)
            {
                stack.push(current);
                current=current.left;
            }
            current=stack.pop();
            System.out.println(current.data);

        current=current.right;\]
        ''
        }
    }


    public static void main(String[] args) {

        Bst bt = new Bst();
        bt.createtree();

        bt.displayDFS(bt.root);
        System.out.println("lenght"+bt.find_length(bt.root));
        
    }
}