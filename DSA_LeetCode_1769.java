package com.company;

class Solution1769 {
    public int[] minOperations(String boxes) {

        int count = 0;

        int [] arr = new int [boxes.length()];

        for(int i=0; i<boxes.length(); i++){
            count = 0;
            for(int j=0; j<boxes.length(); j++){
                if(boxes.charAt(j)=='1'){
                    count += Math.abs(j-i);
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}

public class DSA_LeetCode_1769 {
    public static void main(String[] args) {

    }
}
