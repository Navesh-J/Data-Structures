public class deleteDLL {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.prev=head;
        head.next.next=new Node(30);
        head.next.next.prev=head.next;
        head=deleteHead(head);
        head=deleteTail(head);
        printList(head);
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static Node deleteHead(Node head){
        if(head == null || head.next==null)
            return null;
        head=head.next;
        head.prev=null;
        return head;
    }
    public static Node deleteTail(Node head){
        if(head == null || head.next==null)
            return null;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.prev.next=null;
        return head;
    }
}
