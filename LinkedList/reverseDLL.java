public class reverseDLL {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.prev=head;
        head.next.next=new Node(30);
        head.next.next.prev=head.next;
        printList(head);
        head=reverse(head);
        System.out.println();
        printList(head);
    }
    public static Node reverse(Node head){
        if(head == null || head.next==null){
            return head;
        }
        Node prev=null;
        Node curr=head;
        while(curr != null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
