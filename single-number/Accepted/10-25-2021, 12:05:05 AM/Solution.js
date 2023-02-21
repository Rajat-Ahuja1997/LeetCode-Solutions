// https://leetcode.com/problems/single-number

/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let answer = 0;
    for (let i = 0; i < nums.length; i++) {
        answer ^= nums[i];
    }
    return answer;
};