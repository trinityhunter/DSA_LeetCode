package com.company;

class Solution1480 {
    public int[] runningSum(int[] nums) {

        int sum = 0;
        int [] arr = new int [nums.length];

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;

    }
}

public class DSA_LeetCode_1480 {
    public static void main(String[] args) {

    }
}
