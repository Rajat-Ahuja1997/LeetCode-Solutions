// https://leetcode.com/problems/find-numbers-with-even-number-of-digits

/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function(nums) {
    let evenCounter = 0;
    for (num of nums) {
        let counter = 0
        while (num > 0) {
            num = Math.trunc(num / 10);
            counter++;
        }
        if (counter % 2 === 0) {
            evenCounter++;
        }
    }
    return evenCounter;
};