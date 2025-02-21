public class insertBegin {
    public static void main(String[] args) {
        Node head=null;
        head=add(head,3);
        head=add(head,20);
        head=add(head,10);
        printList(head);
    }
    public static Node add(Node head,int x){
            Node temp = new Node(x);
            temp.next = head;
            return temp;
    }
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
