// https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int unique = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) { //element is sorted so if the current element doesn't equal the                             previous one then we can move forward and increase our unique element count
                nums[++unique] = nums[i];
            }
        }
        return unique + 1; //as the first element is unique so we add 1
    }
}

