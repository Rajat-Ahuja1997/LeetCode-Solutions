// https://leetcode.com/problems/remove-element

class Solution {
    public int removeElement(int[] nums, int val) {
        // We know that each element that != val is a desired element, so we assign each 
        // element that != val to the first few elements and know that all will be eventually assigned.
        int wanted = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[wanted] = nums[i];
                wanted++;
            }
        }
        return wanted;
    }
}