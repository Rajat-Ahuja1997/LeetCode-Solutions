// https://leetcode.com/problems/shuffle-an-array

/**
 * @param {number[]} nums
 */
var Solution = function(nums) {
    this.original = nums;
};

/**
 * @return {number[]}
 */
Solution.prototype.reset = function() {
    return this.original;
};

/**
 * @return {number[]}
 */
Solution.prototype.shuffle = function() {
    let copy = this.original.slice();
    for (let i = copy.length - 1; i >= 0; i--) {
        let x = Math.floor(Math.random() * (i + 1));
        let temp = copy[i];
        copy[i] = copy[x];
        copy[x] = temp;
    }
    console.log(copy)
    return copy;
};


/** 
 * Your Solution object will be instantiated and called as such:
 * var obj = new Solution(nums)
 * var param_1 = obj.reset()
 * var param_2 = obj.shuffle()
 */