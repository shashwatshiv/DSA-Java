// Program to insert a node at begin of a linkedlist if head and new number are given as argument.
public class InsertBegin {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(40);
        Node temp2 = new Node(60);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = new Node(34);
        temp2.next.next = new Node(23);
        temp2.next.next.next = new Node(56);
//        Node head =null;
        head = insert(head,98);
        head = insert(head,95);
        head = insert(head,99);
        head = insert(head,9);
        Main.printList(head);
    }
    static Node insert(Node head, int newHead){
        Node temp = new Node(newHead);
        temp.next = head;
        return temp;

    }
}

//    class Node {
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }



