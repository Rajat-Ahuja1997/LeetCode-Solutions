// https://leetcode.com/problems/valid-mountain-array

/**
 * @param {number[]} arr
 * @return {boolean}
 */
var validMountainArray = function(arr) {
    if (arr.length < 3) {
        return false;
    }
    let i = 0;
    while(arr[i] < arr[i+1]) {
        i++;

    }
    if (i + 1 == arr.length || i == 0) {
        return false;
    }
    for (let j = i; j < arr.length; j++) {
        if (arr[j] <= arr[j+1]) {
            return false;
        }
    }
    return true;   
};