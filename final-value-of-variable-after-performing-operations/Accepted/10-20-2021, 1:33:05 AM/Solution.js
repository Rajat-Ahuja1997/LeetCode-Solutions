// https://leetcode.com/problems/final-value-of-variable-after-performing-operations

/**
 * @param {string[]} operations
 * @return {number}
 */
var finalValueAfterOperations = function(operations) {
    let x = 0;
    for (let operation of operations) {
        if (operation === '--X' || operation === 'X--') {
            x--;
        } else {
            x++;
        }
    }
    return x;
};