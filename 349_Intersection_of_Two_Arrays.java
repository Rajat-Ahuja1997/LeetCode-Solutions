class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> hashNums1 = new HashSet<>();
        Set<Integer> hashNums2 = new HashSet<>();
        for(int num : nums1) {
            hashNums1.add(num);
        }
        for(int num : nums2) {
            hashNums2.add(num);
        }
        
        for (int num : hashNums1) {
            if (hashNums2.contains(num)) {
                list.add(num);
            }
        }
        int[] finalNums = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            finalNums[i]=list.get(i);
        return finalNums;
    }
}