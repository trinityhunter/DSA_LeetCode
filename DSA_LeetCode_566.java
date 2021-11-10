package com.company;

class Solution566 {
    public static int rec(int [][] matrix, int count){

        int count1 = 0;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                count1++;
                if(count1 == count){
                    return matrix[i][j];
                }
            }
        }

        return 0;
    }

    public int[][] matrixReshape(int[][] matrix, int r, int c) {

        int [][] arr = new int [r][c];

        int count = 0;

        if(matrix.length * matrix[0].length == r * c){

            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    count++;
                    arr[i][j] = rec(matrix, count);
                }
            }

            return arr;
        }

        return matrix;
    }
}

public class DSA_LeetCode_566 {
    public static void main(String[] args) {

    }
}
