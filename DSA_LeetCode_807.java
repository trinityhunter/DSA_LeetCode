package com.company;

class Solution807 {
    public static int maxOfRow(int [][] grid, int i, int j){

        int max = 0;

        for(int x=0; x<grid[0].length; x++){
            if(grid[i][x]>max){
                max = grid[i][x];
            }
        }
        return max;
    }

    public static int maxOfCol(int [][] grid, int i, int j){

        int max = 0;

        for(int x=0; x<grid.length; x++){
            if(grid[x][j]>max){
                max = grid[x][j];
            }
        }
        return max;
    }


    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int count = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                int maxRow = maxOfRow(grid, i, j);
                int maxCol = maxOfCol(grid, i, j);

                int possible = Math.min(maxRow, maxCol);

                if(possible>grid[i][j]){
                    count += (possible - grid[i][j]);
                }
            }
        }
        return count;
    }
}

public class DSA_LeetCode_807 {
    public static void main(String[] args) {

    }
}
