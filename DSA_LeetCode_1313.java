package com.company;

class Solution1313 {
    public static int[] rec(int freq, int val){
        int []b = new int[freq];

        for(int i=0; i<freq; i++){
            b[i] = val;
        }
        return b;
    }

    public int[] decompressRLElist(int[] nums) {
        int [] arr = new int [0];

        for(int i=0; i<nums.length; i+=2){
            int[] c = new int[rec(nums[i], nums[i+1]).length + arr.length];
            System.arraycopy(arr, 0, c, 0, arr.length);
            System.arraycopy(rec(nums[i], nums[i+1]), 0, c, arr.length, rec(nums[i], nums[i+1]).length);
            arr = c;
        }

        return arr;
    }
}

public class DSA_LeetCode_1313 {
    public static void main(String[] args) {

    }
}
