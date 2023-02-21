// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        Map<Integer, Integer> sums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (sums.containsKey(target-nums[i])) {
                solution[0] = i;
                solution[1] = sums.get(target-nums[i]);
            } else {
                sums.put(nums[i], i);
            }
        }
        return solution;
        
    }
}