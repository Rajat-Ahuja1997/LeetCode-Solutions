// https://leetcode.com/problems/missing-number

class Solution {
    public int missingNumber(int[] nums) {
        // if we have an array and we are missing a number then we should technically never visit that index;
        int[] result = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            result[n] = 1;
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}