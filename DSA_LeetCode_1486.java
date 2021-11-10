package com.company;

class Solution1486 {
    public int xorOperation(int n, int start) {
        int [] nums = new int [n];

        for(int i=0; i<n; i++){
            nums[i] = start + 2*i;
        }
        int ans = 0;
        for(int ele: nums){
            ans = ans ^ ele;
        }

        return ans;
    }
}

public class DSA_LeetCode_1486 {
    public static void main(String[] args) {

    }
}
