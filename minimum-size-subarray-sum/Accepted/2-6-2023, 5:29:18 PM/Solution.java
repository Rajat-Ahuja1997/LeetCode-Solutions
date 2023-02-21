// https://leetcode.com/problems/minimum-size-subarray-sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windowStart = 0;
        int currentWindowSum = 0;
        int minWindowSize = Integer.MAX_VALUE;
        
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            currentWindowSum += nums[windowEnd];

            while (currentWindowSum >= target) {
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
                currentWindowSum -= nums[windowStart++];
            }
        }
        return minWindowSize == Integer.MAX_VALUE ? 0 : minWindowSize;        
    }
}