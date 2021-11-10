package com.company;

class Solution1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}

public class DSA_LeetCode_1351 {
    public static void main(String[] args) {

    }
}
