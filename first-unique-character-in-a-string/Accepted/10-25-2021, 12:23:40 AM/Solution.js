// https://leetcode.com/problems/first-unique-character-in-a-string

/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    let instances = new Map();
    for (let i = 0; i < s.length; i++) {
        if (instances.has(s[i])) {
            instances.set(s[i], instances.get(s[i]) + 1);
        } else {
            instances.set(s[i], 1);
        }
    }
    for (let i = 0; i < s.length; i++) {
        if (instances.get(s[i]) === 1) {
            return i;
        }
    }
    return -1;
};