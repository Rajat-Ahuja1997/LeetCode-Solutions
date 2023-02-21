// https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters

class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int maxSubstring = Integer.MIN_VALUE;
        int windowStart = 0;
        Map<Character, Integer> frequency = new HashMap<>();
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightLetter = s.charAt(windowEnd);
            frequency.put(rightLetter, frequency.getOrDefault(rightLetter, 0) + 1);
            while (frequency.size() > k) {
                char leftLetter = s.charAt(windowStart);
                frequency.put(leftLetter, frequency.get(leftLetter) - 1);
                if (frequency.get(leftLetter) == 0) {
                    frequency.remove(leftLetter);
                }
                windowStart++;
            }
            maxSubstring = Math.max(maxSubstring, windowEnd - windowStart + 1);
        }
        return maxSubstring;
    }
}