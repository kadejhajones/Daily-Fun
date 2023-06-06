//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.

class Solution {
    public int singleNumber(int[] nums) {
        //add the elements into a set 
        //if it is not in the set then return it 
        int i = 0; 
        int size = nums.length;

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int k = 0; k < size; k++)
        {
            if(hashmap.containsKey(nums[k]))
            {
                hashmap.put(nums[k], hashmap.get(nums[k])+1);
            }
            else
            {
                hashmap.put(nums[k],1);
            }
        }
       
        for(Map.Entry<Integer,Integer> k:hashmap.entrySet())
        {
            if(k.getValue() == 1){
            i=k.getKey();
            break;
            }
        }
        return i;
    }
}
