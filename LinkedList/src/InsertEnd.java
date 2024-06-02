public class InsertEnd {
    public static void main(String[] args) {
        Node head = new Node(30);
        head.next = new Node(10);
        head.next.next = new Node(99);
        head = insert(head,11);
        Main.printList(head);
        System.out.println("ding");
        insertVoid(null,19);
        Main.printList(head);
    }
    static Node insert(Node head, int newTail){

        Node temp = new Node(newTail);
        if(head == null) return temp;
        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next =temp;
    return head;
    }
    // this function needs to return head to ensure edge case of head being null
    // otherwise while running the function exception is thrown.
    static void insertVoid(Node head, int newTail){

        Node temp = new Node(newTail);
        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;}

}
