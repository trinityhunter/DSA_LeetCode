package com.company;

class Solution1475 {
    public int[] finalPrices(int[] prices) {

        for(int i = 0; i < prices.length; i++) {
            for(int j = i+1; j < prices.length; j++) {
                if(prices[j] <= prices[i]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}

public class DSA_LeetCode_1475 {
    public static void main(String[] args) {

    }
}
