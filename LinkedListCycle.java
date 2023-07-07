/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        //checking to see if any of the nodes are connected creating a "never ending loop"
            ListNode slowPointer = head;
            ListNode fastPointer = head;

        //while none of them are null keeping looping 
        while(fastPointer!=null && fastPointer.next!=null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            //if both of the pointers meet that means there is a loop so return true 
            if(fastPointer==slowPointer) {
                return true;
            }
        }

        //else no loop 
        return false;

    }
}
