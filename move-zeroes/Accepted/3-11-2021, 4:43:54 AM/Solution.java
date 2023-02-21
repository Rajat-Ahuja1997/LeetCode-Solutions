// https://leetcode.com/problems/move-zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int numZeroes = 0;
        int wanted = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numZeroes++;
            } else {
                nums[wanted] = nums[i];
                wanted++;
            }
        }
        for (int i = wanted; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}