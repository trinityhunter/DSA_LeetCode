package com.company;

class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        int good = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    good++;
                }
            }
        }
        return good;
    }
}

public class DSA_LeetCode_1512 {
    public static void main(String[] args) {

    }
}
