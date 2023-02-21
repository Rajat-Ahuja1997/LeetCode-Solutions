// https://leetcode.com/problems/first-unique-character-in-a-string

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            characterCount.put(s.charAt(i), characterCount.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char c: s.toCharArray()) {
            if (characterCount.get(c) == 1) {
                return s.indexOf(c);
            }
        }
        return -1;
    }
}