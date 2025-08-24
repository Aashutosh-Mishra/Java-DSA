import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class CreatingLinkedList {
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        Node y1=new Node(arr.get(0));
        Node y2= new Node(arr.get(1));
        Node y3= new Node(arr.get(2));
        Node y4= new Node(arr.get(3));
        Node y5= new Node(arr.get(4));

        int head=y1.data;
        System.out.println("head of linked list is "+head);
        y1.next=y2;
        y2.next=y3;
        y3.next=y4;
        y4.next=y5;


        System.out.println(y1.data+" "+y1.next);
        System.out.println(y2.data+" "+y2.next);
        System.out.println(y3.data+" "+y3.next);
        System.out.println(y4.data+" "+y4.next);
        System.out.println(y5.data+" "+y5.next);

    }

    
}
