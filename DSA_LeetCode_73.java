package com.company;

import java.util.ArrayList;

class Solution73 {
    public static void setRow(int [][] matrix, int i){

        for(int j=0; j<matrix[0].length; j++){
            matrix[i][j] = 0;
        }
    }

    public static void setColumn(int [][] matrix, int j){

        for(int i=0; i<matrix.length; i++){
            matrix[i][j] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {

        ArrayList<Integer> arri = new ArrayList<>();
        ArrayList<Integer> arrj = new ArrayList<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    arri.add(i);
                    arrj.add(j);
                }
            }
        }

        for(int i=0; i<arri.size(); i++){
            setRow(matrix, arri.get(i));
            setColumn(matrix, arrj.get(i));
        }
    }
}

public class DSA_LeetCode_73 {
    public static void main(String[] args) {

    }
}
