// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences

class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            frequency.put(letter, frequency.getOrDefault(letter, 0) + 1);
        }
        int occurrences = frequency.get(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            if (frequency.get(s.charAt(i)) != occurrences) {
                return false;
            }
        }
        return true;
    }
}