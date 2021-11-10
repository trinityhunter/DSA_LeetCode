package com.company;

class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int [2*n];
        int x = 0;
        int y = n;
        int count = 0;

        for(int i=0; i<n; i++){
            arr[count] = nums[x];
            x++;
            count++;
            arr[count] = nums[y];
            y++;
            count++;
        }
        return arr;
    }
}


public class DSA_LeetCode_1470 {
    public static void main(String[] args) {

    }
}
