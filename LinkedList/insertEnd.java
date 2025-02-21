public class insertEnd {
    public static void main(String[] args) {
        Node head=null;
        head=add(head,3);
        head=add(head,20);
        head=add(head,10);
        printList(head);
    }

    public static Node add(Node head,int x){
            Node temp = new Node(x);
            Node curr = head;
            if(head == null){
                return temp;
            }
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;
            return head;
    }
    
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
