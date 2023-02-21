// https://leetcode.com/problems/valid-parentheses

/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    if (s.length % 2 !== 0) {
        return false;
    }
    let stack = [];
    for (let i = 0; i < s.length; i++) {
        if (s[i] === '(' || s[i] === '[' || s[i] === '{') {
            stack.push(s[i]);
        } else if (s[i] === ')') {
            let popped = stack.pop();
            if (popped !== '(') {
                return false;
            }
        } else if (s[i] === ']') {
            let popped = stack.pop();
            if (popped !== '[') {
                return false;
            }
        } else {
            let popped = stack.pop();
            if (popped !== '{') {
                return false;
            }
        }
    }
    return stack.length === 0;
};