// https://leetcode.com/problems/find-numbers-with-even-number-of-digits

class Solution {
    public int findNumbers(int[] nums) {
        int totalEven = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int count = 0;
            while (currentNum != 0) {
                currentNum /= 10;
                count++;
            }
            if (count % 2 == 0) {
                totalEven++;
            }
        }
        return totalEven;
    }
}