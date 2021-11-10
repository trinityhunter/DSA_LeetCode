package com.company;

import java.util.ArrayList;
import java.util.Collections;

class Solution1329 {
    public static void putInArrayList(ArrayList<Integer> arr, int [][] mat, int i, int j){

        // ArrayList<Integer> arr1 = new ArrayList<>();

        for(int x=i, y=j; x<mat.length && y<mat[0].length; x++, y++){
            arr.add(mat[x][y]);
        }

        // return arr;
    }

    public static void putInMatrix(ArrayList<Integer> arr, int [][] mat, int i, int j){

        // int [][] mat1 = new int [mat.length][mat[0].length];

        for(int x=i, y=j, z=0; x<mat.length && y<mat[0].length && z<arr.size(); x++, y++, z++){
            mat[x][y] = arr.get(z);
        }

        // return mat1;
    }


    public int[][] diagonalSort(int[][] mat) {



        for(int i=0; i<mat.length; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            // arr = putInArrayList(mat, i, 0);
            putInArrayList(arr, mat, i, 0);
            Collections.sort(arr);
            putInMatrix(arr, mat, i, 0);
        }

        for(int j=1; j<mat[0].length; j++){
            ArrayList<Integer> arr = new ArrayList<>();
            // arr = putInArrayList(mat, 0, j);
            putInArrayList(arr, mat, 0, j);
            Collections.sort(arr);
            putInMatrix(arr, mat, 0, j);
        }

        return mat;
    }
}

public class DSA_LeetCode_1329 {
    public static void main(String[] args) {

    }
}
