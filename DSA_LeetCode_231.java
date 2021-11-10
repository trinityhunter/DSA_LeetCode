package com.company;

class Solution231 {
    public boolean isPowerOfTwo(int n) {

        // Brute Force:-

        // boolean ans = false;
        // for(int i=0; i<=Math.ceil(Math.pow(n, 0.5)); i++){
        //     if(Math.pow(2, i)==n){
        //         ans = true;
        //         break;
        //     }
        // }
        // return ans;


        //Recursion:-

        if(n==1){
            return true;
        }
        if(n==0 || n%2!=0){
            return false;
        }
        return isPowerOfTwo(n/2);

    }
}

class DSA_LeetCode_231 {
    public static void main(String[] args) {

    }
}