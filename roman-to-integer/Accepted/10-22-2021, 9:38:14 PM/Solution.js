// https://leetcode.com/problems/roman-to-integer

/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    const numerals = {
        "I": 1,
        "V": 5,
        "X": 10,
        "L": 50,
        "C": 100,
        "D": 500,
        "M": 1000
    };
    
    let answer = 0;
    
    for (let i = 0; i < s.length - 1; i++) {
        if (numerals[s[i]] < numerals[s[i+1]]) {
            answer -= numerals[s[i]];
        } else {
            answer += numerals[s[i]];
        }
    }
    answer += numerals[s[s.length-1]];
    return answer;
};