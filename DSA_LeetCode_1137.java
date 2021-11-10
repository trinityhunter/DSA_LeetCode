package com.company;

class Solution1137 {
    public int tribonacci(int n) {
//         int [] qb = new int[n+1];

//         if(n==0){
//             return 0;
//         }
//         if(n==1 || n==2){
//             return 1;
//         }

//         if(qb[n]!=0){
//             return qb[n];
//         }

//         int t1 = tribonacci(n-1);
//         int t2 = tribonacci(n-2);
//         int t3 = tribonacci(n-3);

//         qb[n] = t1+t2+t3;

//         return t1+t2+t3;

        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }

        int []dp = new int [n+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for(int i = 3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[n];
    }
}

public class DSA_LeetCode_1137 {
    public static void main(String[] args) {

    }
}
