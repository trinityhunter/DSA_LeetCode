package com.company;

class Solution326 {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        if(n==0 || n%3!=0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
}

public class DSA_LeetCode_326 {
    public static void main(String[] args) {

    }
}
