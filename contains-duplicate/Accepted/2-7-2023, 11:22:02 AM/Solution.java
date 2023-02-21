// https://leetcode.com/problems/contains-duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // this is not sorted so we have to use a set
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (mySet.contains(nums[i])) {
                return true;
            }
            mySet.add(nums[i]);
        }
        return false;
    }
}