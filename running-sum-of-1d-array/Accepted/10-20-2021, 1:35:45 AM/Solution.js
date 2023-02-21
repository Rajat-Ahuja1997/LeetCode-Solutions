// https://leetcode.com/problems/running-sum-of-1d-array

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    let runningSum = 0;
    let runningNums = [];
    for (let i = 0; i < nums.length; i++) {
        runningSum += nums[i];
        runningNums[i] = runningSum;
    }
    return runningNums;
};