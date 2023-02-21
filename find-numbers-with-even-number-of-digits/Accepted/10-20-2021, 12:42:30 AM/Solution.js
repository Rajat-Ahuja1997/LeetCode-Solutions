// https://leetcode.com/problems/find-numbers-with-even-number-of-digits

/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function(nums) {
    let totalCounter = 0;
    for (let i = 0; i < nums.length; i++) {
        let x = nums[i];
        let counter = 0;
        while (x >= 1) {
            x = x /10;  
            counter++;
            console.log(x + ' ' + counter)
        }
        if (counter % 2 === 0) {
            totalCounter++;
        }
    }
    return totalCounter;
};