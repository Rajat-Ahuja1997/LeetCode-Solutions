// https://leetcode.com/problems/find-the-difference

class Solution {
    public char findTheDifference(String s, String t) {
        int charCodeS = 0;
        int charCodeT = 0;
        for(int i = 0; i < s.length(); i++) {
            charCodeS += s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++) {
            charCodeT += t.charAt(i);
        }
        return (char)(charCodeT - charCodeS);
    }
}