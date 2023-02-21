// https://leetcode.com/problems/isomorphic-strings

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    let map = new Map();
    let values = new Set();
    if (s.length !== t.length) {
        return false;
    }
    for (let i = 0; i < s.length; i++) {
        if (!map.has(s[i])) {
            if (values.has(t[i])) {
                return false;
            }
            values.add(t[i]);
            map.set(s[i], t[i]);
        } else {
            if (map.get(s[i]) !== t[i]) {
                return false;
            }
        }
    }
    return true;
};