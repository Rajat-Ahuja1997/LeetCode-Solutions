// https://leetcode.com/problems/missing-number

class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            expectedSum += (i + 1);
        }
        return expectedSum - sum;
    }
}