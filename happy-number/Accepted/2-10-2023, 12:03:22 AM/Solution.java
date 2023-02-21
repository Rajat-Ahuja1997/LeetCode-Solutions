// https://leetcode.com/problems/happy-number

class Solution {
    public boolean isHappy(int n) {
        if (n == 1){ 
            return true;
        }
        // the numbers we generate form an implicit LL so we can use floyd's detection algorithm to see if we have a cycle or not. and the test for if we have a cycle is if we ever reach 1 or if our ptrs match each other
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            System.out.println(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
            if (slowRunner == 1) {
                return true;
            }
        }
        return false;
    }

    public int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
}