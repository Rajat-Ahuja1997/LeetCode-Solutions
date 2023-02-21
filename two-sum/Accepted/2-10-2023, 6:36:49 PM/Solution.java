// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (sum.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = sum.get(target - nums[i]);
            } else {
                sum.put(nums[i], i);
            }
        }
        return result;
    }
}