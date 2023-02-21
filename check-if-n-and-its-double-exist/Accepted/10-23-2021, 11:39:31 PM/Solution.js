// https://leetcode.com/problems/check-if-n-and-its-double-exist

/**
 * @param {number[]} arr
 * @return {boolean}
 */
var checkIfExist = function(arr) {
    let map = new Map();
    for (let i = 0; i < arr.length; i++) {
        let m = 2 * arr[i];
        let mHalf = arr[i] / 2;
        if (map.has(m) || map.has(mHalf)) {
            return true;
        } else {
            map.set(arr[i], i);
        }
    }
    return false;
};