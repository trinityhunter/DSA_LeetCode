package com.company;

class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int [] arr2 = new int [nums.length];

        for(int i=0; i<nums.length; i++){
            arr2[i] = nums[i] * nums[i];
        }

        int i, j, key;

        for(j=1; j<arr2.length; j++){
            key = arr2[j];

            i = j - 1;
            while(i>=0 && key<arr2[i]){
                arr2[i+1] = arr2[i];
                i--;
            }
            arr2[i+1] = key;
        }
        return arr2;
    }
}
public class DSA_LeetCode_977 {
    public static void main(String[] args) {

    }
}
