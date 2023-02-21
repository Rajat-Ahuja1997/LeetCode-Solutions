// https://leetcode.com/problems/find-smallest-letter-greater-than-target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2; 
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // if start == length then we continued through the array and never found an element that sufficed and are now out of bounds.
        return start == letters.length ? letters[0] : letters[start];
    }
}