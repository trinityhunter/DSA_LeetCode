package com.company;

class Solution1572 {
    public int diagonalSum(int[][] mat) {
        int sum1 = 0;
        int sum2 = 0;
        int er = mat.length - 1, ec = mat[0].length - 1;
        for(int sr = 0, sc = 0; sr<=er && sc<=ec; sr++, sc++){
            // if(sr<=er && sc<=ec){
            sum1 += mat[sr][sc];
            // }
        }
        for(int sr = 0, sc = mat[0].length-1; sr<=er && sc>=0; sr++, sc--){
            // if(sr<=er && sc>=0){
            sum2 += mat[sr][sc];
            // }
        }
        if(mat.length%2==0){
            return (sum1 + sum2);
        }
        else if(mat.length==1){
            return sum1;
        }
        else{
            return (sum1 + sum2) - (mat[(mat.length-1)/2][(mat.length-1)/2]);
        }
    }
}

public class DSA_LeetCode_1572 {
    public static void main(String[] args) {

    }
}
