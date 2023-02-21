// https://leetcode.com/problems/peak-index-in-a-mountain-array

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // we are essentially looking for the index of the maximum number of the array.
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            // we are in the decreasing part of the array
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                // we are in the increasing part of the array
                start = mid + 1;
            }
        }
        return start;
    }
}