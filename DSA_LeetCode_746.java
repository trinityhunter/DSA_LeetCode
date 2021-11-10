package com.company;

class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int [] dp = new int [cost.length+1];
        dp[0] = 0;
        dp[1] = 0;

        for(int i=2; i<=cost.length; i++){
            dp[i] =  Math.min(cost[i-1] + dp[i-1], cost[i-2] + dp[i-2]);
        }
        return dp[cost.length];
    }
}

public class DSA_LeetCode_746 {
    public static void main(String[] args) {

    }
}
