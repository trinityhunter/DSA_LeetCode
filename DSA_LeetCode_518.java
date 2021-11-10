package com.company;

class Solution518 {
    public int change(int amount, int[] coins) {
//         int []dp = new int [amount + 1];
//         dp[0] = 1;

//         for(int i=0; i<coins.length; i++){
//             for(int j=coins[i]; j<dp.length; j++){
//                 dp[j] += dp[j-coins[i]];
//             }
//         }
//         return dp[amount];

        int [][]dp = new int [coins.length + 1][amount + 1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i==0 && j==0){
                    dp[i][j] = 1;
                }
                else if(i==0){
                    dp[i][j] = 0;
                }
                else if(j==0){
                    dp[i][j] = 1;
                }
                else{
                    dp[i][j] = dp[i-1][j];

                    if(j>=coins[i-1]){
                        dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
                    }
                }
            }
        }
        return dp[coins.length][amount];
    }
}

public class DSA_LeetCode_518 {
    public static void main(String[] args) {

    }
}
