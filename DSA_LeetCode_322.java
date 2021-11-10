package com.company;

class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int [][]dp = new int[coins.length + 1][amount + 1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i==0){
                    dp[i][j] = Integer.MAX_VALUE-1;
                }
                else if(j==0){
                    dp[i][j] = 0;
                }
                else{
                    if(j>=coins[i-1]){
                        dp[i][j] =  Math.min(dp[i-1][j], 1+dp[i][j - coins[i-1]]);
                    }
                    else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        if(dp[coins.length][amount]==Integer.MAX_VALUE-1){
            return -1;
        }

        return dp[coins.length][amount];

    }
}

public class DSA_LeetCode_322 {
    public static void main(String[] args) {

    }
}
