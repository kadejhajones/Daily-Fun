//Given a sorted array of distinct integers and a target value, return the index if the target is found.
//If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.

import java.util.*;

class Solution {
    
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            //if its in the middle of where it should be then thats the spot
            if(target <= nums[i])
                return i;
        } 
        return nums.length;
    }
}
