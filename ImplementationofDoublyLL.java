import java.util.*;


public class ImplementationofDoublyLL {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = this.prev = null;
        }
    }

    static class LinkedList{
        Node head = null;
        Node tail = null;
        void add(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.prev = temp;
                tail = newNode;
            }
        }

        void displayForword(){
            if(head == null){
                return;
            }
            else{
                Node temp = head;
                while(temp != null){
                    System.out.print(temp.data+"->");
                    temp = temp.next;
                }
            }
        }

        void displayBackward(){
            if(head == null){
                return;
            }
            else{
                Node temp = tail;
                while(temp != null){
                    System.out.print(temp.data+"->");
                    temp = temp.prev;
                }
            }
        }

        // End of Doubly LinkedList
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.displayForword();
        System.out.println();
        list.displayBackward();
    }
}
