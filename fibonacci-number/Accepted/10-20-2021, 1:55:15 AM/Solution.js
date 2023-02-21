// https://leetcode.com/problems/fibonacci-number

/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    if (n == 0) {
        return 0;
    }
    if (n == 1 || n == 2) {
        return 1;
    } else {
        return fib(n - 2) + fib(n - 1);
    }
};