// https://leetcode.com/problems/search-in-a-sorted-array-of-unknown-size

/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

class Solution {
    public int search(ArrayReader reader, int target) {
        // first find the range --> first start with a box of size 2
        // condition for target to lie in the range is target < end. We don't care about end until we are searching'

        int start = 0;
        int end = 1;
        while (reader.get(end) < target) {
            start = end + 1;
            end *= 2;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > reader.get(mid)) {
                start = mid + 1;
            } else if (target < reader.get(mid)) {
                end = mid - 1;
            } else {
                return mid;
            }
        }        
        return -1;
    }
}