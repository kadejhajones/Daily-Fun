//Given an array nums of size n, return the majority element.

//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> countsByVal = new HashMap<>();

        //could have used a bag but needed to use a hashmap instead 
        for(int i = 0; i < nums.length; i++){
            int val = nums[i]; 
            //check if the element is in the hashmap 
            if(!countsByVal.containsKey(val)){
                //if not added it 
                countsByVal.put(val, 0);
            }
            countsByVal.put(val, countsByVal.get(val)+1);
        }

        int valWithBiggestCount = 0;
        int biggestCount =-1;
        //memory bank: aka know how to do this 
        for(int val: countsByVal.keySet()){
            //looping through the set to find highest and seeing if current highest is      smaller than the one being looked at 
            if(countsByVal.get(val)>biggestCount) {
                valWithBiggestCount = val;
                biggestCount = countsByVal.get(val);
            }
        }

        return valWithBiggestCount;
    }
}
