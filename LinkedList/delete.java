public class delete {
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node head=null;
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head = deleteFirst(head);
        head = deleteLast(head);
        printList(head);
    }

    public static Node deleteFirst(Node head){
        if(head == null)
        return null;
        return head.next;
    }
    public static Node deleteLast(Node head){
        if(head == null) return null;
        Node curr = head;
        while(curr.next.next != null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
}
