public class searchlist {
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(45);
        head.next.next=new Node(16);
        head.next.next.next=new Node(87);
        head.next.next.next.next=new Node(145);
        System.out.println("Found at position: "+search(head,1));
    }
    public static int search(Node head,int data){
        int pos=1;
        while(head!=null){
            if(head.data == data){
                return pos;
            }
            pos++;
            head=head.next;
        }
        return -1;
    }
}
