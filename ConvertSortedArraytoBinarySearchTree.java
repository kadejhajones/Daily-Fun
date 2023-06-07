//Given an integer array nums where the elements are sorted in ascending order, convert it to a 
//height-balanced binary search tree.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helperMethod(nums, 0, nums.length);
    }
    
    public TreeNode helperMethod(int[] s, int begin, int end){
        //inclusive exclusive 
        
        //terminator: reached end 
        if(end == begin){
            return null;
        }

        int mid = (end + begin)/2;
        
        //this is our root 
        TreeNode newNode = new TreeNode(s[mid]);

        //recursively call for right and left 
        
        newNode.left = helperMethod(s,  begin, mid);
        newNode.right = helperMethod(s,  mid + 1, end);

        return newNode;
    
    }
}
