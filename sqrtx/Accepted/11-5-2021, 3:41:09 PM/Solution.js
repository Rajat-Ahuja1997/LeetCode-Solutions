// https://leetcode.com/problems/sqrtx

/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    let start = 1;
    let end = x;
    while (start < end) { // we can use true as we know the square root exists
        let mid = start + Math.floor((end - start)/2);
        if ((mid * mid) < x) {
            start = mid + 1;
        } else if ((mid * mid) > x) {
            end = mid - 1;
        } else if ((mid * mid) === x) {
            return mid;
        }
    }
    return x < end * end ? end - 1 : end; 
};