package com.company;

class Solution1827 {
    public int minOperations(int[] arr) {
        int count = 0;

        if(arr.length<=1){
            return 0;
        }

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>=arr[i+1]){
                count += arr[i] - arr[i+1] + 1;
                arr[i+1] += arr[i] - arr[i+1] + 1;
            }
        }
        return count;
    }
}

public class DSA_LeetCode_1827 {
    public static void main(String[] args) {

    }
}
