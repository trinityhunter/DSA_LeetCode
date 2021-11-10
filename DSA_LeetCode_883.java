package com.company;

class Solution883 {
    public int projectionArea(int[][] grid) {

        int count = 0;

//         for xy plane (bottom)

        count += grid.length * grid[0].length;

//         for xz plane (front)

        int zeros = 0;

        for(int i=0; i<grid.length; i++){
            int max = -1;
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]>max){
                    max = grid[i][j];
                }
                if(grid[i][j]==0){
                    zeros++;
                }
            }
            count += max;
        }


//         for yz plane (side)

        for(int j=0; j<grid[0].length; j++){
            int max = -1;
            for(int i=0; i<grid.length; i++){
                if(grid[i][j]>max){
                    max = grid[i][j];
                }
            }
            count += max;
        }

        return count - zeros;
    }
}

public class DSA_LeetCode_883 {
    public static void main(String[] args) {

    }
}
