import java.util.*;


public class insertAtSpecificPosition {
    static class Node {
        int data;
        Node next;

         Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList{
        Node head = null;

         Node insertAtEnd(int value){
            Node newNode = new Node(value);
            if(head == null){
               head = newNode;
            }
            else{
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            return head;
        }

        Node insertAtHead(int value){
             Node newNode = new Node(value);
             if(head == null){
                 insertAtEnd(value);
             }
             else{
                 newNode.next = head;
                 head = newNode;
             }
             return head;
        }

        Node insertAtIDX(int idx, int value){
             Node newNode = new Node(value);

             Node temp = head;
             for(int i = 1; i < idx-1; i++){
                 temp = temp.next;
             }

             newNode.next = temp.next;
             temp.next = newNode;
             return head;
        }


        //Deletion Operations;

        void deleteAtHead(){
             if(head == null){
                 return ;
             }
             else head = head.next;
        }

        void deleteAtEnd(){
             if(head == null) return;

             Node temp = head;
             while(temp.next.next != null){
                 temp = temp.next;
             }

             temp.next = null;
        }

        void deleteAtIDX(int idx){
             if(head == null) return;
             if(idx == 1) deleteAtHead();

             Node temp = head;
             for(int i = 1; i < idx-1; i++){
                 temp = temp.next;
             }
             temp.next = temp.next.next;
        }

        public void display(){
             if(head == null){
                 System.out.println("List is Empty.");
                 return;
             }

             Node temp = head;
             while(temp != null){
                 System.out.print(temp.data+"->");
                 temp = temp.next;
             }
        }
      //End of LinkedList Class
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        list.insertAtHead(5);
        list.insertAtIDX(3,6);

        list.deleteAtHead();
        list.deleteAtEnd();
        list.deleteAtIDX(2);


        list.display();
    }
}
