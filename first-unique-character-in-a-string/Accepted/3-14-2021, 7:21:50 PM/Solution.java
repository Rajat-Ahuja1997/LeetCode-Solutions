// https://leetcode.com/problems/first-unique-character-in-a-string

class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> characterCount = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            characterCount.put(s.charAt(i), characterCount.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Character character: characterCount.keySet()) {
            if (characterCount.get(character) == 1) {
                return s.indexOf(character);
            }
        }
        return -1;
    }
}