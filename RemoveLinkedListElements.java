//Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //this is the recursive approach 
        //if there is nothing there then return null
        if(head == null){
            return null;
        }
        
       //if the point where we are at is the value we want to remove then ... 
       if(head.val == val){
            return removeElements(head.next, val);
        }

        //if not iterate through 
        head.next = removeElements(head.next, val);

        //return the start 
        return head;
    }
}
