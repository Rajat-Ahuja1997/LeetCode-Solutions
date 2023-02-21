// https://leetcode.com/problems/remove-duplicates-from-sorted-array

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let slow = 0;
    for (let i = 0; i < nums.length; i++) {
        if (nums[slow] != nums[i]) {
            slow++;
            nums[slow] = nums[i];
        }
    }
    return slow + 1;
    
};