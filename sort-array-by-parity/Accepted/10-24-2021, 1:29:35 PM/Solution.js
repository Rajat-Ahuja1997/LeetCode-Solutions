// https://leetcode.com/problems/sort-array-by-parity

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArrayByParity = function(nums) {
    let i = 0, j = 0;
    for (let j = 0; j < nums.length; j++) {
        if (nums[j] % 2 === 0) {
            let temp = nums[i];
            nums[i] = nums[j];
            i++;
            nums[j] = temp;
        }
    }
    return nums;
};