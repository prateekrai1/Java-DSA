package LeetcodeEasy;

//Leetcode - 657 - Robot Return to Origin
//https://leetcode.com/problems/robot-return-to-origin/description/

//Intuition - Let's consider Right, left moves and Up, Down moves as X axis and Y axis respectively.
//We take 'Up' as +ve Y hence we add +1, 'Down' as -ve Y hence we add -1 to the 'y' variable
//Similarly for 'Left' we add -1 to 'x' variable, and for 'Right' we add +1 to 'x' variable
// In the end we just return a boolean value using 'AND' operation checking that is X == 0 && Y == 0

public class Leetcode_657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("LL",0,0));
    }
    public static boolean judgeCircle(String moves, int x, int y) {
        char[] ch = moves.toCharArray();
        for(int i=0; i<moves.length();i++){
            if(ch[i] == 'U'){
                y+=1;
            }
            if(ch[i] == 'D'){
                y-=1;
            }
            if(ch[i] == 'L'){
                x-=1;
            }
            if(ch[i] == 'R'){
                x+=1;
            }
        }
        return x == 0 && y == 0;
    }
}
