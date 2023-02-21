// https://leetcode.com/problems/max-consecutive-ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 1 && nums[0] == 1) {
            return 1;
        }
        int maxOnes = 0;
        int totalMaxOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                maxOnes++;
            } else {
                if (maxOnes > totalMaxOnes) {
                    totalMaxOnes = maxOnes;
                }
                maxOnes = 0; 
            }
        }
        return Math.max(maxOnes, totalMaxOnes);
    }
}