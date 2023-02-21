// https://leetcode.com/problems/first-unique-character-in-a-string

/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    const occurrences = new Map();
    for (let i = 0; i < s.length; i++) {
        if (occurrences.has(s[i])) {
            occurrences.set(s[i], occurrences.get(s[i]) + 1);
        } else {
            occurrences.set(s[i], 1);
        }
    }
    for (let i = 0; i < s.length; i++) {
        if (occurrences.get(s[i]) === 1) {
            return i;
        }
    }
    return -1;

};