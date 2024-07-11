package LeetcodeMedium;


//Leetcode - WordSearch
//https://leetcode.com/problems/word-search/description/
public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCF";
        System.out.println(exist(board,word,0,0,0));
    }
    public static boolean exist(char[][] board, String word, int index,int r, int c) {
        for(int i=0; i< board.length; i++){
            for(int j=0; j<board[i].length;j++){
                if(board[i][j] == word.charAt(0)){
                    boolean ans = search(board,word,i,j,0);
                   if(ans){
                       return true;
                   }
                }
            }
        }
        return false;
    }

    private static boolean search(char[][] board, String word, int r, int c, int index) {
        if(index == word.length()){
            return true;
        }
        if(r<0 || c<0 || r>board.length || c > board[0].length || board[r][c] != word.charAt(index) ){
            return false;
        }
        board[r][c] = '*';

        int[] row = {-1,1,0,0};
        int[] col = {0,0,-1,1};

        for(int i=0; i<col.length;i++){
            boolean ans = search(board,word,r+row[i],c+col[i],index+1);
            if(ans){
                return true;
            }
        }
        board[r][c] = word.charAt(index);
        return false;
    }
}
