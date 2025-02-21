public class insertGiven {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
    public static Node add(Node head,int pos,int data){
        Node temp=new Node(data);
        if(pos == 1){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        for(int i=1;i<=pos-2 && curr!=null;i++){
            curr=curr.next;
        }
        if(curr == null){
            return head;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    
    public static void main(String[] args) {
        Node head=null;
        head=add(head,1,10);
        head=add(head,2,20);
        head=add(head,3,40);
        head=add(head,4,50);
        head=add(head,3,30);
        printList(head);
    }
}
