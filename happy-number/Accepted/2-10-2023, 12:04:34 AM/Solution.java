// https://leetcode.com/problems/happy-number

class Solution {
    public boolean isHappy(int n) {
        if (n == 1){ 
            return true;
        }
        // the numbers we generate form an implicit LL so we can use floyd's detection algorithm to see if we have a cycle or not. and the test for if we have a cycle is if we ever reach 1 or if our ptrs match each other
        int slowRunner = n;
        int fastRunner = n;
        do {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        } while (slowRunner != fastRunner);
        return slowRunner == 1;
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