// https://leetcode.com/problems/valid-palindrome

class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", ""); //Using regex to replace any character except a-zA-Z0-9
        s = s.toLowerCase();
        char[] sChar = s.toCharArray();
        int a = 0;
        int z = sChar.length - 1;
        while (a < z) {
            if (sChar[a] != sChar[z]) {
                return false;
            } 
            a++;
            z--;
        }
        return true;        
    }
}