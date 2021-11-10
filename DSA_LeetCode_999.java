package com.company;

class Solution999 {
    public static int top(int i, int j, char [][] board){
        for(int x=i; x>=0; x--){
            if(board[x][j]=='B'){
                return 0;
            }

            if(board[x][j]=='p'){
                return 1;
            }
        }
        return 0;
    }

    public static int bottom(int i, int j, char [][] board){
        for(int x=i; x<board.length; x++){
            if(board[x][j]=='B'){
                return 0;
            }

            if(board[x][j]=='p'){
                return 1;
            }
        }
        return 0;
    }

    public static int leftSide(int i, int j, char [][] board){
        for(int x=j; x>=0; x--){
            if(board[i][x]=='B'){
                return 0;
            }

            if(board[i][x]=='p'){
                return 1;
            }
        }
        return 0;
    }

    public static int rightSide(int i, int j, char [][] board){
        for(int x=j; x<board[0].length; x++){
            if(board[i][x]=='B'){
                return 0;
            }

            if(board[i][x]=='p'){
                return 1;
            }
        }
        return 0;
    }

    public int numRookCaptures(char[][] board) {

        int ans = 0;

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='R'){
                    int up = top(i, j, board);
                    int down = bottom(i, j, board);
                    int left = leftSide(i, j, board);
                    int right = rightSide(i, j, board);

                    ans = up+down+left+right;
                }
            }
        }
        return ans;
    }
}

public class DSA_LeetCode_999 {
    public static void main(String[] args) {

    }
}
