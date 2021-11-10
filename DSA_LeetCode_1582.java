package com.company;

class Solution1582 {
    public static int isRowZero(int [][] matrix, int i, int j){
        int count = 0;

        for(int x=0; x<matrix.length; x++){
            if(matrix[x][j]==0){
                count++;
            }
        }

        if(count==matrix.length-1){
            return 1;
        }

        return 0;
    }


    public static int isColZero(int [][] matrix, int i, int j){
        int count = 0;

        for(int y=0; y<matrix[0].length; y++){
            if(matrix[i][y]==0){
                count++;
            }
        }

        if(count == matrix[0].length-1){
            return 1;
        }

        return 0;
    }


    public int numSpecial(int[][] matrix) {

        int count = 0;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==1){
                    if(isRowZero(matrix, i, j) + isColZero(matrix, i, j) == 2){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}

public class DSA_LeetCode_1582 {
    public static void main(String[] args) {

    }
}
