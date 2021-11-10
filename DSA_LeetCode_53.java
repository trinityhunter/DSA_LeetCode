package com.company;

class Solution53 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            if(sum<0){
                sum = nums[i];
            }
            else{
                sum += nums[i];
            }
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
}


public class DSA_LeetCode_53 {
    public static void main(String[] args) {

    }
}
