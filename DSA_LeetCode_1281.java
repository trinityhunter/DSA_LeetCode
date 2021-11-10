package com.company;

class Solution1281 {
    public int subtractProductAndSum(int n) {

        String str = String.valueOf(n);

        int prod = 1;

        int sum = 0;

        for(int i=0; i<str.length(); i++){
            prod *= str.charAt(i) - '0';
            sum += str.charAt(i) - '0';
        }

        return prod-sum;
    }
}

public class DSA_LeetCode_1281 {
    public static void main(String[] args) {

    }
}
