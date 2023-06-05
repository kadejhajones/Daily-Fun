//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(hashSet.contains(nums[i])){  
                return true;
            }else {
                hashSet.add(nums[i]);
            }
        }
        return false;
    }
}
