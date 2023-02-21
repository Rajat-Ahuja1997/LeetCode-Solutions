// https://leetcode.com/problems/contains-duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            duplicates.add(nums[i]);
        }
        if (duplicates.size() != nums.length) return true;
        return false;
    }
}