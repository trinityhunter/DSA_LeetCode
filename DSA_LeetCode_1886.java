package com.company;

class Solution1886 {
    public static boolean isEqual(int [][] mat, int [][] target){

        int count = 0;

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==target[i][j]){
                    count++;
                }
            }
        }

        if(count == (mat.length * mat[0].length)){
            return true;
        }
        return false;
    }

    public static int [][] rotate(int [][] mat){

        int [][] newMat = new int [mat.length][mat[0].length];

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                newMat[i][j] = mat[j][mat.length - 1 -i];
            }
        }
        return newMat;
    }


    public boolean findRotation(int[][] mat, int[][] target) {


        for(int i=0; i<4; i++){
            if(isEqual(mat, target)){
                return true;
            }
            else{
                mat = rotate(mat);
            }
        }
        return false;
    }
}

public class DSA_LeetCode_1886 {
    public static void main(String[] args) {

    }
}
