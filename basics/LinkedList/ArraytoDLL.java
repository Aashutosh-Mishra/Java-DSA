class ListNode1{
    int val;
    ListNode1 next;
    ListNode1 prev;
    ListNode1(){
        val=0;
        next=null;
        prev=null;
    }
    ListNode1(int data){
        val=data;
        next=null;
        prev=null;

    }
    ListNode1(int data,ListNode1 next1,ListNode1 prev1){
        val=data;
        next=next1;
        prev=prev1;
    }
}

public class ArraytoDLL {
    public static ListNode1 arrayTODLL(int nums[]){
        int size=nums.length;
        if(size==0) return null;

        ListNode1 head= new ListNode1(nums[0]);
        ListNode1 prev=head;
        for(int i=1;i<size;i++){
            ListNode1 newNode = new ListNode1(nums[i]);
            newNode.prev=prev;
            prev.next=newNode;
            prev=newNode;
        }
        return head;
    }

    public static void printDll(ListNode1 head){
        while(head!=null){
            System.out.print(head.val+"<->");
            head=head.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7,8};
        ListNode1 head= arrayTODLL(nums);
        printDll(head);
    }
    
}
