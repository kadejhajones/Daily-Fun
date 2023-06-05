//Given the roots of two binary trees p and q, write a function to check if they are the same or not.
//Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
import java.util.*;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // when looping through the tree there should be the same 
        
        //check to see if both are null
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null){
            return false;
        }

        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.right, q.right) &&  isSameTree(p.left, q.left);


        // //check right 
        // p.right != null && q.right != null)
        //     if(p.right.val == q.right.val){
        //         if(p.left != null && q.left != null){
        //             if(p.left.val == q.left.val){
        //                 return true;
        //             }
        //         }
        //     }           

     

        //check to see either were null and if the roots are the same if not return false
        // while((p != null && q != null) && (p.val == q.val)){
            //if both aren't null then check them
            // if(p.right != null && q.right != null){
            // }
                    
            //if both aren't null then check them
            // if(p.left != null && q.left != null){
            //     return isSame(p.left, q.left);            
            // }
            // return true;
        }
        //return false;
 //   }
}
