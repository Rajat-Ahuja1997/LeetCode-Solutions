class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedNums[i] = nums[i];
        }
        Arrays.sort(sortedNums);
        if (sortedNums[nums.length - 1] < (sortedNums[nums.length - 2]) * 2) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == sortedNums[nums.length - 1])
                return i;
        }
        return -1;
    }
}