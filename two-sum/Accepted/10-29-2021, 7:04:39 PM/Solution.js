// https://leetcode.com/problems/two-sum

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const numbers = new Map();
    const answer = [];
    for (let i = 0; i < nums.length; i++) {
        let desired = target - nums[i];
        if (numbers.has(desired)) {
            answer.push(numbers.get(desired));
            answer.push(i);
            return answer;
        } else {
            numbers.set(nums[i], i);
        }
    }
    console.log(numbers);
    console.log(answer)

};