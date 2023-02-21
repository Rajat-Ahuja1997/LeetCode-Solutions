// https://leetcode.com/problems/longest-substring-without-repeating-characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int longestSubstring = 0;
        Map<Character, Integer> frequency = new HashMap<>();
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightLetter = s.charAt(windowEnd);
            frequency.put(rightLetter, frequency.getOrDefault(rightLetter, 0) + 1);
            while (frequency.get(rightLetter) > 1) {
                char leftLetter = s.charAt(windowStart);
                frequency.put(leftLetter, frequency.get(leftLetter) - 1);
                if (frequency.get(leftLetter) == 0) {
                    frequency.remove(leftLetter);
                }
                windowStart++;
            }
            longestSubstring = Math.max(longestSubstring, windowEnd - windowStart + 1);
        }
        return longestSubstring;
    }
}