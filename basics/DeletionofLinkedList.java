
import java.util.*;

// Node structure
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

class Solution {
    // Function to delete the head node of the linked list
    public ListNode deleteHead(ListNode head) {
        // If list is empty, nothing to delete
        if (head == null) 
            return null;

        // Set temporary pointer
        ListNode temp = head;

        // Update head to the next node 
        head = head.next;

        // Delete original head    
        temp = null;

        // Return new head          
        return head;
    }


    public ListNode deleteTail(ListNode head) {

        // If the list is empty or has only one node
        if (head == null || head.next == null) {
            return null; // Return null
        }

        // Temporary pointer
        ListNode temp = head;

        /* Traverse to the second last 
        node in the list */
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Delete the last node
        temp.next = null;

        // Return head of modified list
        return head;
    }

    public ListNode deleteKthNode(ListNode head, int k) {
        // If the list is empty, return null
        if (head == null)
            return null;

        // If k is 1, delete the head node
        if (k == 1) {
            ListNode temp = head;
            head = head.next;
            return head;
        }

        // Initialize a temporary pointer
        ListNode temp = head;

        // Traverse to the (k-1)th node
        for (int i = 0; temp != null && i < k - 2; i++) {
            temp = temp.next;
        }

        /* If k is greater than the number of nodes, 
        return the unchanged list */
        if (temp == null || temp.next == null)
            return head;

        // Delete the k-th node
        ListNode next = temp.next.next;
        temp.next = next;

        // Return head
        return head;
    }

     // To delete a node with a specific value in a linked list
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        // Check if list is empty
        if (head == null)
            return head;

        // If first node has target value, delete
        if (head.val == X) {
            head = head.next;
            return head;
        }

        ListNode temp = head;
        ListNode prev = null;

        /* Traverse the list to find 
        the node with the target value */
        while (temp != null) {
            if (temp.val == X) {
                // Adjust the pointers
                prev.next = temp.next;
                return head;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}

public class DeletionofLinkedList {
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Function to insert a new node at the beginning of the linked list
    public static ListNode insertAtHead(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    
    public static void main(String[] args) {
        // Create a linked list
        ListNode head = null;
        head = insertAtHead(head, 3);
        head = insertAtHead(head, 2);
        head = insertAtHead(head, 1);

        System.out.print("Original list: ");
        printList(head);
        
        // Creating an instance of Solution Class
        Solution sol = new Solution();
        
        // Function call to delete the head node
        head = sol.deleteHead(head);

        System.out.print("List after deleting head: ");
        printList(head);
    }
}
