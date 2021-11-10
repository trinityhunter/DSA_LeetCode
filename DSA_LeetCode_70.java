package com.company;

class Solution70 {
    public int climbStairs(int n) {
//         if(n==0){
//             return 1;
//         }
//         else if(n<0){
//             return 0;
//         }

//         int [] qb = new int[n+1];
//         if(qb[n]!=0){
//             return qb[n];
//         }

//         int first = climbStairs(n-1);
//         int second = climbStairs(n-2);

//         int ans = first + second;
//         qb[n] = ans;

//         return ans;

        int [] dp = new int [n+1];
        dp[0] = 1;

        for(int i=1; i<=n; i++){
            if(i==1){
                dp[i] = dp[i-1];
            }
            else if(i==2){
                dp[i] = dp[i-1] + dp[i-2];
            }
            else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }


}

public class DSA_LeetCode_70 {
    public static void main(String[] args) {

    }
}
