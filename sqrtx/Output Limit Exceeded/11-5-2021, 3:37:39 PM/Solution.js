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
        console.log('start ' + start);
        console.log('end ' + end);
        console.log('mid ' + mid);
        if ((mid * mid) < x) {
            start = mid;
        } else if ((mid * mid) > x) {
            end = mid;
        } else if ((mid * mid) === x) {
            return mid;
        }
    }
    return start;
};