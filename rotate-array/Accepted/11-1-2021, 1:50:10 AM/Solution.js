// https://leetcode.com/problems/rotate-array

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    k %= nums.length;
    if (nums.length === 1) {
        return;
    }
    reverse(nums, 0, nums.length-1);
    reverse(nums, 0, k-1);
    reverse(nums, k, nums.length-1);
};

reverse = (nums, i, j) => {
    while (i < j) {
        let temp = nums[i];
        nums[i++] = nums[j];
        nums[j--] = temp;
    }
}