class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int sum = 0, leftSum = 0, rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        rightSum = sum;
        for(int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            rightSum -= nums[i];
        }
        return -1;
    }
}