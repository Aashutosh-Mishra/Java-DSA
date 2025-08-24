class Node{
    int data;
    Node next;
    Node back;

    Node(int data1,Node next1,Node back1){
        data=data1;
        next=next1;
        back=back1;
    }

    Node(int data1){
        data=data1;
        next=null;
        back=null;
    }
}

class DoLinkedList{
    public static void main(String args[]){
        Node n1= new Node(10);
        Node n2=new Node(20);
        Node n3= new Node(30);
        Node n4= new Node(40);
        Node n5= new Node(50);

        n1.next=n2;
        n2.back=n1;

        n2.next=n3;
        n3.back=n2;

        n3.next=n4;
        n4.back=n3;

        n4.next=n5;
        n5.back=n4;

        Node head=n1;
        Node temp=head;

        System.out.println("Traversal in forward direction");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");


        System.out.println("Traversal in backward direction");
        Node tail=n5;
        Node temp1=tail;
        while(temp1!=null){
            System.out.print(temp1.data+"<->");
            temp1=temp1.back;
        }
        System.out.println("null");
    }
}