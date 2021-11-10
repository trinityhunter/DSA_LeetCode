package com.company;

class Solution832 {

    public int[][] flipAndInvertImage(int[][] image) {
        int [][] arr = new int[image.length][image[0].length];
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[0].length; j++){
                arr[i][j] = image[i][image[j].length - j - 1];
                if(arr[i][j]==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }
}

public class DSA_LeetCode_832 {
    public static void main(String[] args) {

    }
}
