//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

import java.util.*;
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode prev = current;
        while(current != null && current.next != null){
            if(current.val == current.next.val){
                prev = current;
                current.next = current.next.next;
            } else {
              current = current.next;
            }
        }
        return head;
    }
}
