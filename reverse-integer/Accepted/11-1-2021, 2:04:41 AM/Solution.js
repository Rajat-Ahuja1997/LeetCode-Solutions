// https://leetcode.com/problems/reverse-integer

/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let originalX = x;
    let result = 0;
    x = Math.abs(x);
    let i = Math.floor(Math.log10(x));
    while (x > 0) {
        let digit = x % 10;
        console.log(digit);
        result += (digit * (10**i));
        x = Math.trunc(x/10);
        i--;
    }
    if (result > 2**31) {
        return 0;
    }
    return originalX < 0 ? result*-1 : result;
};