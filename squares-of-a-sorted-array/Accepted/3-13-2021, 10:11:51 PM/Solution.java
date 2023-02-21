// https://leetcode.com/problems/squares-of-a-sorted-array

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squares[i] = nums[i] * nums[i];
        }
        Arrays.sort(squares);
        return squares;
    }
}