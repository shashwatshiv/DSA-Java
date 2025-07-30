public class DeleteHead {
    public static void main(String[] args) {
        Node head = new Node(34);
        head.next = new Node(23);
        head.next.next = new Node(56);
        head = deleteHead(head);
        Main.printList(head);
    }

    public static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        }
        else {
            head = head.next;
            return  head;
        }

    }
}
