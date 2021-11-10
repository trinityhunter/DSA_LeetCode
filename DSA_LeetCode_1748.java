package com.company;

class Solution1748 {
    public int sumOfUnique(int[] nums) {

        int [] freq = new int [101];

        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }

        int count = 0;

        for(int i=0; i<freq.length; i++){
            if(freq[i]==1){
                count += i;
            }
        }

        return count;
    }
}

public class DSA_LeetCode_1748 {
    public static void main(String[] args) {

    }
}
