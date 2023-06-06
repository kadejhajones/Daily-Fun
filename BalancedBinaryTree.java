//Given a binary tree, determine if it is 
//height-balanced meaning that a binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

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
    public boolean isBalanced(TreeNode root) {
        return length(1, root)>0;
    }

    public int length(int height, TreeNode root){
        if(root == null){
            return height;
        }

        int right = length(height+1, root.right);
        int left = length(height+1, root.left);

        if(right < 0 || left < 0 || Math.abs(left-right) > 1){
            return -1;
        }
        return Math.max(left, right);

    }
}
