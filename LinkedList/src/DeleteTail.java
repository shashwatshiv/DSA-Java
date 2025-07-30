public class DeleteTail {
    public static void main(String[] args) {
        System.out.println("hello world");
        Node head = new Node(34);
        head.next = new Node(23);
        head.next.next = new Node(56);
        head = deleteTail(head);
        Main.printList(head);
    }
    public static Node deleteTail(Node head){
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return null;
        } else {
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            return head;}

    }
}
