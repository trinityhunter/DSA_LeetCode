package com.company;

class Solution1252 {
    public int oddCells(int m, int n, int[][] indices) {

        int [][] arr = new int [m][n];

        for(int i=0; i<indices.length; i++){
            for(int j=0; j<n; j++){
                arr[indices[i][0]][j]++;
            }
            for(int k=0; k<m; k++){
                arr[k][indices[i][1]]++;
            }
        }

        int count = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]%2==1){
                    count++;
                }
            }
        }
        return count;
    }
}

public class DSA_LeetCode_1252 {
    public static void main(String[] args) {

    }
}
