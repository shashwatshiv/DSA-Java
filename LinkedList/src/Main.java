public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Node head = new Node(10);
        Node temp1 = new Node(40);
        Node temp2 = new Node(60);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = new Node(34);
        temp2.next.next = new Node(23);
        temp2.next.next.next = new Node(56);
        printList(head);
        printRecur(head);
        }
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    static void printRecur(Node head){

        if(head ==null) return;
        System.out.println(head.data);
        printRecur(head.next);
    }


    }


 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;

    }
}

