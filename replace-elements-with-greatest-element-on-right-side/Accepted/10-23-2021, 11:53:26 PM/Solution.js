// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side

/**
 * @param {number[]} arr
 * @return {number[]}
 */
var replaceElements = function(arr) {
    let n = arr.length - 1;
    let greatestOnRight = arr[n];
    arr[n] = -1;
    for (let i = n - 1; i >= 0; i--) {
        let temp = arr[i];
        arr[i] = greatestOnRight;
        if (temp > greatestOnRight) {
            greatestOnRight = temp;
        }
    }
    return arr;
    
};