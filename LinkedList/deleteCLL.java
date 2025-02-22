public class deleteCLL {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=head;
        printList(head);
        head=delStart(head);
        System.out.println();
        printList(head);
        System.out.println();
        int pos=4;
        head=delPos(head,pos);
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

    public static Node delStart(Node head){
        if(head == null || head.next==null) 
            return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }

    public static Node delPos(Node head,int pos){
        if(pos == 1)
            return delStart(head);
        Node curr=head;
        for(int i=0;i<pos-2;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
