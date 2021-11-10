package com.company;

class Solution1299 {
    public static int nextGreater(int [] arr, int i){

        int max = 0;

        for(int x=i+1; x<arr.length; x++){
            if(arr[x]>max){
                max = arr[x];
            }
        }

        return max;
    }

    public int[] replaceElements(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                arr[i] = -1;
            }
            else{
                arr[i] = nextGreater(arr, i);
            }
        }

        return arr;
    }
}

public class DSA_LeetCode_1299 {
    public static void main(String[] args) {

    }
}
