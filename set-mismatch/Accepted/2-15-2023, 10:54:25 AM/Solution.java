// https://leetcode.com/problems/set-mismatch

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // search for missing, duplicate
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result[0] = nums[i];
                result[1] = i + 1;
            }
        }
        return result;
    }

    private void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }    
}