// https://leetcode.com/problems/min-stack


var MinStack = function() {
    this.array = [];
};

/** 
 * @param {number} val
 * @return {void}
 */
MinStack.prototype.push = function(val) {
    let min = this.array.length === 0 ? val : Math.min(val, this.array[this.array.length-1].min);
    console.log(min);
    this.array.push({"val": val, "min": min});
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function() {
    return this.array.pop();
};

/**
 * @return {number}
 */
MinStack.prototype.top = function() {
    return this.array[this.array.length-1].val;
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function() {
    return this.array[this.array.length-1].min;
};

/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */