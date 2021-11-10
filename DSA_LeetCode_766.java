package com.company;

class Solution766 {
    public static boolean isValid(int [][]matrix, int i, int j){

        int count = 0;

        int count1 = 0;

        for(int x=i+1, y=j+1; x<matrix.length && y<matrix[0].length; x++, y++){
            if(matrix[i][j]==matrix[x][y]){
                count++;
            }
            count1++;
        }

        if(count == count1){
            return true;
        }
        return false;
    }

    public boolean isToeplitzMatrix(int[][] matrix) {

        int count1 = 0;

        int count2 = 0;

        for(int j=0; j<matrix[0].length; j++){
            if(isValid(matrix, 0, j)){
                count1++;
            }
        }

        for(int i=0; i<matrix.length; i++){
            if(isValid(matrix, i, 0)){
                count2++;
            }
        }

        if(count1 + count2 == matrix.length + matrix[0].length){
            return true;
        }

        return false;
    }
}

public class DSA_LeetCode_766 {
    public static void main(String[] args) {

    }
}
