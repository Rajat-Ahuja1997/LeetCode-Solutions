// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int firstPosition = search(nums, target, true);
        int endPosition = search(nums, target, false);

        result[0] = firstPosition;
        result[1] = endPosition;
        return result;
    }

    private int search(int[] nums, int target, boolean findStartIndex) {
        int answer = -1;;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                // potential answer found;
                answer = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return answer;
    }
}