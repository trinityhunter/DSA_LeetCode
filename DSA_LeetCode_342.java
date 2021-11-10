package com.company;

class Solution342 {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n==0 || n%4!=0){
            return false;
        }
        return isPowerOfFour(n/4);
    }
}

public class DSA_LeetCode_342 {
    public static void main(String[] args) {

    }
}
