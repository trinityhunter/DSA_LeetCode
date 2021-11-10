package com.company;

class Solution1929 {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;

        int [] arr = new int[2 * n];

        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        return arr;
    }
}

public class DSA_LeetCode_1929 {
    public static void main(String[] args) {

    }
}
