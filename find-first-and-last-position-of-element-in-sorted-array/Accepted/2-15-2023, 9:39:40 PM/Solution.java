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

    // we use a helper method to run the binary search twice. first we run it to find the earlier position of a number. then we use it to find the latest position of that number.
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
                // if we are searching for the first position then it is possible there are even earlier target numbers to the left. so we make the end = mid + 1. 
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    // if we are searching for the end position then it is possible there are later target number to the right. so we make the start = mid + 1; 
                    start = mid + 1;
                }
            }
        }
        return answer;
    }
}