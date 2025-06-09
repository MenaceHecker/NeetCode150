//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            if (counts.containsKey(num)) {
                return true; 
            } else {
                counts.put(num, 1); 
            }
        }

        return false; 
    }
}