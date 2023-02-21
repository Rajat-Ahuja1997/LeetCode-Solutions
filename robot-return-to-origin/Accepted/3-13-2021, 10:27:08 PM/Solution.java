// https://leetcode.com/problems/robot-return-to-origin

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(int i = 0;i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                y--;
                continue;
            }
            else if(moves.charAt(i) == 'D') {
                y++;
                continue;
            }
            else if(moves.charAt(i)== 'R') {
                x++;
                continue;
            }
            else if(moves.charAt(i) == 'L') {
                x--;
                continue;
            }
        }
        if(x == 0 & y == 0) {
            return true;
        }
        return false;
    }
}