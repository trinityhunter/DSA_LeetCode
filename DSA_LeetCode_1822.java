package com.company;

class Solution1822 {
    public int arraySign(int[] nums) {

        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                count++;
            }
        }
        if(count%2==1){
            return -1;
        }
        else{
            return 1;
        }
    }
}

public class DSA_LeetCode_1822 {
    public static void main(String[] args) {

    }
}
