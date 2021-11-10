package com.company;

class Solution1720 {
    public int[] decode(int[] encoded, int first) {
        int [] arr = new int [encoded.length + 1];
        arr[0] = first;

        for(int i=0; i<arr.length-1; i++){
            arr[i+1] = arr[i] ^ encoded[i];
        }
        return arr;
    }
}

public class DSA_LeetCode_1720 {
    public static void main(String[] args) {

    }
}
