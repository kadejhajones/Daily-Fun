//Given an integer array nums and an integer k, 
//return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;
        Map<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int newKey = nums[i];
            if (hashMap.containsKey(newKey)) {
                List<Integer> index = hashMap.get(newKey);
                if (i - index.get(index.size() - 1) <= k) {
                    return true;
                }
                hashMap.get(newKey).add(i);
            } else {
                List<Integer> index = new ArrayList<>();
                index.add(i);
                hashMap.put(newKey, index);
            }
        }
        return false;
    }
}
