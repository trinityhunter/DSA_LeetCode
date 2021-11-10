package com.company;

class Solution1295 {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=10 && nums[i]<=99 || nums[i]>=1000 && nums[i]<=9999 || nums[i]==100000){
                even++;
            }
        }
        return even;
    }
}

public class DSA_LeetCode_1295 {
    public static void main(String[] args) {

    }
}
