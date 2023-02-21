// https://leetcode.com/problems/palindrome-number

/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    const originalX = x;
    if (x < 0) {
        return false;
    }
    let digits = Math.floor(Math.log10(x));
    let result = 0;
    while (x > 0) {
        result += (x%10 * (10**digits));
        x = Math.trunc(x/10);
        digits--;
    }
    return result === originalX;
};