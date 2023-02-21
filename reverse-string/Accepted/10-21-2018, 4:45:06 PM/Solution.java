// https://leetcode.com/problems/reverse-string

class Solution {
    public String reverseString(String s) {
        StringBuilder input1 = new StringBuilder(s); 
        return input1.reverse().toString();
    }
}