// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side

class Solution {
    public int[] replaceElements(int[] arr) {
        int max = 0;
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] > max) {
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            } else {
                arr[i] = max;
            }
            System.out.println(arr[i]);
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}