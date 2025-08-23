class Node{
    int data;
    Node next;
    Node(int val){
        data=val;
        next=null;
    }
}

public class SearchanElement {
    public static Node arrayToLinkedList(int arr[]){
        int size=arr.length;
        if(size==0) return null;
        Node head= new Node(arr[0]);
        Node curr=head;
        for(int i=1;i<size;i++){
            curr.next=new Node(arr[i]);
            curr=curr.next;
        }
        return head;
    }
    public static void printLinkedList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static boolean SearchanElement(Node head, int key){
        Node curr=head;
        while(curr !=null){
            if(curr.data==key) return true;
            curr=curr.next;
        }
        return false;
    }

    public static void main(String args[]){
        int arr[]={2,3,4,5,6,7,8,9};
        Node head=arrayToLinkedList(arr);
        printLinkedList(head);
        int key=5;
        System.out.println("Is "+key+" present in the Linked List? "+SearchanElement(head,key));
        key=10; 
        System.out.println("Is "+key+" present in the Linked List? "+SearchanElement(head,key));
    }
    
}
