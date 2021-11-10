package com.company;

class Solution1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int [] arr = new int[rectangles.length];

        int max = 0;

        for(int i=0; i<rectangles.length; i++){
            arr[i] = Math.min(rectangles[i][0], rectangles[i][1]);
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(max == arr[i]){
                count++;
            }
        }
        return count;
    }
}

public class DSA_LeetCode_1725 {
    public static void main(String[] args) {

    }
}
