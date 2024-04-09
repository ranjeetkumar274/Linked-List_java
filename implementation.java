public class implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){
                insertAtEnd(val);
            }
            else{
                temp.next = head;
                head = temp;
            }
        }
        void insertAt(int idx, int val){
            Node temp = head;
            if(idx == size()){
                insertAtEnd(val);
                return;
            }
            if(idx == 0){
                insertAtHead(val);
                return;
            }
            Node t = new Node(val);
            for(int i = 1; i <= idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        int Getele(int idx){
            if(idx < 0 && idx > size()){
                System.out.println("wrong index found");
                return -1;
            }
            Node temp = head;
            for(int i = 1; i <= idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx){
            int size = size();
            Node temp = head;
            if(idx == size()-1){
                tail = temp;
                size--;
                return ;
            }
            if(idx == 0){
                temp = temp.next;
                size--;
                return;
            }
            for(int i = 1; i <= idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }


        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            Node temp = head;
            int count = 0;
            while( temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(13);
        ll.insertAtEnd(4);

        System.out.println();
        ll.insertAtEnd(5);
        ll.insertAtEnd(12);

        System.out.println(ll.size());
        System.out.println();
        ll.insertAt(2,10);
        ll.insertAt(0,25);
        ll.insertAt(6,26);
        ll.display();
        System.out.println();
        System.out.println(ll.tail.data);
        System.out.println(ll.Getele(2));
        System.out.println(ll.Getele(4));
        ll.deleteAt(4);
        ll.display();
        System.out.println();
        System.out.println(ll.size());

    }
}
