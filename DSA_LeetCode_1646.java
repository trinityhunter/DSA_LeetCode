package com.company;

class Solution1646 {
    public int getMaximumGenerated(int n) {
        int [] dp = new int [n+1];

        if(n==0){
            return 0;
        }

        dp[0] = 0;
        dp[1] = 1;

        int max = 1;

        for(int i=2; i<dp.length; i++){
            if(i%2==0){
                dp[i] = dp[i/2];
            }
            else{
                dp[i] = dp[(int)Math.floor(i/2)] + dp[(i+1)/2];
            }
            if(dp[i]>max){
                max = dp[i];
            }
        }
        return max;
    }
}

public class DSA_LeetCode_1646 {
    public static void main(String[] args) {

    }
}
