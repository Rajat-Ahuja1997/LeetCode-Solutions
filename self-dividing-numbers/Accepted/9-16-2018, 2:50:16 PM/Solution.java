// https://leetcode.com/problems/self-dividing-numbers

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividing = new ArrayList<Integer>();
        for(int i = left; i <= right; i++) {
            if(isSelfDividing(i)) {
                selfDividing.add(i);
            }
        }
        return selfDividing;
    }
        
    public static boolean isSelfDividing(int n) {
        int initialN = n;
        List<Integer> checker = new ArrayList<Integer>();
        while (n > 0) {
            int d = n / 10;
            int r = n % 10;
            n = d;
            checker.add(r);
        }
        if(checker.contains(0)) {
            return false;
        }
        for(int i = 0; i < checker.size(); i++) {
            if(initialN % checker.get(i) == 0) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
