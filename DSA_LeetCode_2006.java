package com.company;

class Solution2006 {
    public int countKDifference(int[] nums, int k) {

        int count = 0;

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) == k){
                    count++;
                }
            }
        }

        return count;
    }
}

public class DSA_LeetCode_2006 {
    public static void main(String[] args) {

    }
}
