// https://leetcode.com/problems/contains-duplicate

/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const set = new Set();
    for (let i = 0; i < nums.length; i++) {
        set.add(nums[i]);
    }
    return set.size !== nums.length;
};