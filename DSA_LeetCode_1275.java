package com.company;

class Solution1275 {
    public String tictactoe(int[][] moves) {

        int [][] arr = new int [3][3];

        for(int i=0; i<moves.length; i++){
            if(i%2==0){
                arr[moves[i][0]][moves[i][1]] = 1;
            }
            else if(i%2==1){
                arr[moves[i][0]][moves[i][1]] = 2;
            }
        }


        for(int i=0; i<3; i++){
            if((arr[i][0]==1 && arr[i][1]==1 && arr[i][2]==1) || (arr[0][i]==1 && arr[1][i]==1 && arr[2][i]==1) || (arr[0][0]==1 && arr[1][1]==1 && arr[2][2]==1) || (arr[0][2]==1 && arr[1][1]==1 && arr[2][0]==1)){
                return "A";
            }
            if((arr[i][0]==2 && arr[i][1]==2 && arr[i][2]==2) || (arr[0][i]==2 && arr[1][i]==2 && arr[2][i]==2) || (arr[0][0]==2 && arr[1][1]==2 && arr[2][2]==2) || (arr[0][2]==2 && arr[1][1]==2 && arr[2][0]==2)){
                return "B";
            }
        }

        if(moves.length==9){
            return "Draw";
        }

        return "Pending";
    }
}

public class DSA_LeetCode_1275 {
    public static void main(String[] args) {

    }
}
