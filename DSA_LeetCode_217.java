package com.company;

import java.util.Arrays;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            // for(int j=i+1; j<nums.length; j++){
            if(nums[i]==nums[i+1]){
                return true;
            }
            // }
        }
        return false;
    }
}

public class DSA_LeetCode_217 {
    public static void main(String[] args) {

    }
}
