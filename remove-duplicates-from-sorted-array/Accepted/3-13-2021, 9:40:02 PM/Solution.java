// https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int unique = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[j-1]) {
                unique++;
                nums[unique] = nums[j];
            }
        }
        return unique + 1;
    }
}

