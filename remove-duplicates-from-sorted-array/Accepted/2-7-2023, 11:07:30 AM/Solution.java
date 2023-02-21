// https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Solution {
    public int removeDuplicates(int[] nums) {
        // slow pointer --> unique
        // fast pointer --> i
        int unique = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[unique]) {
                nums[++unique] = nums[i];
            }
        }
        return unique + 1;
    }
}