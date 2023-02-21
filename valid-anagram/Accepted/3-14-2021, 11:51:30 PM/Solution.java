// https://leetcode.com/problems/valid-anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] characters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            characters[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            characters[t.charAt(i) - 'a']--;
        }
        for (int j = 0; j < characters.length; j++) {
            if (characters[j] != 0) return false;
        }
        return true;
    }
}