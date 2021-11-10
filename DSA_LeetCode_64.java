package com.company;

class Solution64 {
    public int minPathSum(int[][] grid) {
        int [][] dp = new int [grid.length][grid[0].length];

        for(int i=grid.length-1; i>=0; i--){
            for(int j=grid[0].length-1; j>=0; j--){
                if(i==grid.length-1 && j==grid[0].length-1){
                    dp[i][j] = grid[i][j];
                }
                else if(j==grid[0].length-1){
                    dp[i][j] = grid[i][j] + dp[i+1][j];
                }
                else if(i==grid.length-1){
                    dp[i][j] = grid[i][j] + dp[i][j+1];
                }
                else{
                    dp[i][j] = grid[i][j] + Math.min(dp[i+1][j], dp[i][j+1]);
                }
            }
        }

        return dp[0][0];
    }
}

public class DSA_LeetCode_64 {
    public static void main(String[] args) {

    }
}
