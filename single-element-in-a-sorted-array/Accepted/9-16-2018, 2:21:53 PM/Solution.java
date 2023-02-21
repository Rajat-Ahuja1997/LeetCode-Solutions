// https://leetcode.com/problems/single-element-in-a-sorted-array

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int finalVal = 0;
        for(int i = 0; i < nums.length; i++) {
            finalVal ^= nums[i];
        }
        return finalVal;
    }
}