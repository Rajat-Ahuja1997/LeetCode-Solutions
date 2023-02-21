// https://leetcode.com/problems/arranging-coins

/**
 * @param {number} n
 * @return {number}
 */
var arrangeCoins = function(n) {
    let completeRows = 0;
    let rowCounter = 1;
    while (n > 0) {
        n -= rowCounter;
        rowCounter++;
        completeRows++;
    }
    return n === 0 ? completeRows : completeRows - 1;
};