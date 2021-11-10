package com.company;

class Solution1672 {
    public int maximumWealth(int[][] accounts) {

        int max = 0;
        for(int i=0; i<accounts.length; i++){
            int wealth = 0;
            for(int j=0; j<accounts[0].length; j++){
                wealth += accounts[i][j];

                if(wealth>max){
                    max = wealth;
                }
            }
        }
        return max;
    }
}

public class DSA_LeetCode_1672 {
    public static void main(String[] args) {

    }
}
