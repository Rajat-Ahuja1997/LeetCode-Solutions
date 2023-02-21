// https://leetcode.com/problems/single-element-in-a-sorted-array

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int solution = 0;
        for (int i = 0; i < nums.length; i++) {
            solution ^= nums[i];
        }
        return solution;
    }
}