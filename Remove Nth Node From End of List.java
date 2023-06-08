//Given the head of a linked list, remove the nth node from the end of the list and return its head.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> newArray = new ArrayList<>();
        while(head != null){
            //adding an extra node 
            newArray.add(head);
            head = head.next;
        }

        if(newArray.size() == 0 || n  newArray.size()){
            return null;
        }

        if(n == newArray.size()){
            return newArray.get(0).next;
        }

        newArray.get(newArray.size() - n - 1).next = newArray.get(newArray.size() - n).next;
        return newArray.get(0);
    }

}
