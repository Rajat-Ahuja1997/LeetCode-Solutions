// https://leetcode.com/problems/remove-element

class Solution {
    public int removeElement(int[] nums, int val) {
        int wanted = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[wanted] = nums[i];
                wanted++;
            }
        }
        return wanted;
    }
}