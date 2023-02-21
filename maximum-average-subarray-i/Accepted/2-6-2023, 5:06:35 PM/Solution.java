// https://leetcode.com/problems/maximum-average-subarray-i

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Integer.MIN_VALUE;
        int currentRunningAverage = 0;

        for (int i = 0; i < nums.length; i++) {
            currentRunningAverage += nums[i];
            if (i >= k - 1) {
                double currentAverage = currentRunningAverage / (double)k;
                maxAverage = Math.max(maxAverage, currentAverage);
                currentRunningAverage -= nums[i - (k - 1)];
            }
        }
        return maxAverage;
    }
}