// https://leetcode.com/problems/happy-number

/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    const s = new Set();
    while (n != 1) {
        let result = 0;
        while (n > 0) {
            let remainder = n % 10;
            result += (remainder**2);
            n = Math.floor(n / 10);
        }
        n = result;
        if (s.has(n)) {
            return false; 
        } else {
            s.add(n);
        }
    }
    return true;
};