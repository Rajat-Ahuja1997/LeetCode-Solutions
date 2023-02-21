// https://leetcode.com/problems/check-if-n-and-its-double-exist

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Float> seen = new HashSet();
        for(int i=0; i<arr.length; i++){
            if( seen.contains((float)arr[i]*2) || seen.contains((float)arr[i]/2)){
                return true;
            }
            seen.add((float) arr[i]);
        }
        return false;
    }
}