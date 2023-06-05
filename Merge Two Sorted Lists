// You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
//Return the head of the merged linked list.

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //create a new list to put everything into 
        //need to check if either side is null
        //if they arent null then see what is smaller add it into the singly linked list 
        //if it is null then loop through and add all of the elements that are null 

        ListNode answerList = new ListNode(0);
        ListNode endNode = answerList;

        //while each of the lists aren't null  
        while((list1 != null && list2 != null)){
            //check to see what which is smaller and then add it onto the answer list 
            if (list1.val <= list2.val){
                ListNode newEnd = new ListNode(list1.val);
                endNode.next = newEnd;
                endNode = newEnd;
                list1 = list1.next;
            }else if(list1.val > list2.val){
                ListNode newEnd = new ListNode(list2.val);
                endNode.next = newEnd;
                endNode = newEnd;
                list2 = list2.next;
            }
        }
        //what if one of them is null 
        while(list2 != null){
            ListNode newEnd = new ListNode(list2.val);
            endNode.next = newEnd;
            endNode = newEnd;
            list2 = list2.next;
        }
        while(list1 != null){
            ListNode newEnd = new ListNode(list1.val);
            endNode.next = newEnd;
            endNode = newEnd;
            list1 = list1.next;
        }
        return answerList.next;
    }
}
