// https://leetcode.com/problems/max-consecutive-ones

/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let counter = 0;
    let maxCounter = 0;
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === 1) {
            counter++; 
        } else {
            if (counter > maxCounter) {
                maxCounter = counter;
            }
            counter = 0;
        }
    }
    return Math.max(counter, maxCounter);
};