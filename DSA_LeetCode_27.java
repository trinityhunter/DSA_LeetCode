package com.company;

class Solution27 {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;

    }
}
public class DSA_LeetCode_27 {

    public static void main(String[] args) {

    }
}
