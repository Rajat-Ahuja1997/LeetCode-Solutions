// https://leetcode.com/problems/remove-duplicates-from-sorted-array

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    if (nums.length === 0) {
        return 0;
    }
    let i = 0;
    for (let j = 1; j < nums.length; j++) {
        if (nums[j] === nums[i]) {
            continue;
        } else {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
};
//i is the slow pointer, where our value goes
// j is an undesirable value and is the fast pointer