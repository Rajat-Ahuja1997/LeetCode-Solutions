// https://leetcode.com/problems/missing-number

class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int j = nums[i]; // j is the value at our current index
            if (nums[i] != i && nums[i] != nums.length) {
                int temp = j; //
                nums[i] = nums[j];
                nums[j] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}