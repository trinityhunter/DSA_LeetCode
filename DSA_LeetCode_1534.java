package com.company;

class Solution1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int good = 0;

        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c){
                        good++;
                    }
                }
            }
        }return good;
    }
}

public class DSA_LeetCode_1534 {
    public static void main(String[] args) {

    }
}
