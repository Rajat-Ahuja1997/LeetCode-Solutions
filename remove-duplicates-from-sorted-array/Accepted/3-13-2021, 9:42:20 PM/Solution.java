// https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int unique = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) { 
                nums[++unique] = nums[i];
            }
        }
        return unique + 1;
    }
}

