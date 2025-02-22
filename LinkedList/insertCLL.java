public class insertCLL {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=head;
        printList(head);
        head=addStart(head,0);
        System.out.println();
        printList(head);
        System.out.println();
        head=addEnd(head,60);
        printList(head);
    }
    public static void printList(Node head){
        if(head == null){
            return;
        }
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
        return;
    }

    public static Node addStart(Node head,int x){
        Node temp=new Node(x);
        if(head == null) {
            temp.next=temp;
            return temp;
        }
        temp.next=head.next;
        head.next=temp;
        int t=temp.data;
        temp.data=head.data;
        head.data=t;
        return head;
    }
    public static Node addEnd(Node head,int x){
        Node temp=new Node(x);
        if(head == null) {
            temp.next=temp;
            return temp;
        }
        temp.next=head.next;
        head.next=temp;
        int t=temp.data;
        temp.data=head.data;
        head.data=t;
        return temp;
    }
}
