import java.util.*;

class Node{
    int data;
    Node next;
    Node(int val){
        data=val;
        next= null;
    }
}

public class LinkedList {

    public static Node arryToLinkedList(int[] arr){
        int size = arr.length;
        if(size == 0) return null;
        Node head= new Node(arr[0]);
        Node current=head;
        for(int i=1;i<size;i++){
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void printLinkedList(Node head){
        Node current=head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        Node head=arryToLinkedList(arr);
        printLinkedList(head);
    }
}