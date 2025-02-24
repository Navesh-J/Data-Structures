public class reverseSLL {
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(45);
        head.next.next=new Node(16);
        head.next.next.next=new Node(87);
        head.next.next.next.next=new Node(145);
        printList(head);
        head=reverse(head);
        System.out.println();
        printList(head);
    }
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static Node reverse(Node head){
        Node prev=null,next=null,curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
