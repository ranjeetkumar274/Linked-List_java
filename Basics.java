import org.w3c.dom.Node;

public class Basics {

    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
         temp = temp.next;
        }
    }

    public static void displayr(Node head) {
        if(head == null) return;
            System.out.print(head.data + " ");
            displayr(head.next);
    }

    public static int countlength(Node head) {
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(16);
        Node f = new Node(20);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;


        display(a);  // Displaying the node with a function
        System.out.println();
        displayr(a); //Displaying the node recursively
        System.out.println();
        int n = countlength(a);
        System.out.println(n);
    }
}























