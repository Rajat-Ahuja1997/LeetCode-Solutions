// https://leetcode.com/problems/sort-array-by-parity

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int j =0;
        int[] aSorted = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                aSorted[j++] = A[i];
            }
        }
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                aSorted[j++] = A[i];
            }
        }
        return aSorted;
    }
}