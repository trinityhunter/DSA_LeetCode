package com.company;

import java.util.ArrayList;

class Solution1314 {
    public static ArrayList<Integer> makeArrayList(int a, int k){
        ArrayList<Integer> arr = new ArrayList<>();

        int start = a-k;
        int stop = a+k;

        for(int i=start; i<=stop; i++){
            if(i>=0){
                arr.add(i);
            }
        }

        return arr;
    }

    public static int valueGiver(ArrayList<Integer> row, ArrayList<Integer> col, int[][] mat){

        int count = 0;

        for(int i=0; i<row.size(); i++){
            for(int j=0; j<col.size(); j++){
                if(row.get(i)<=mat.length-1 && col.get(j)<=mat[0].length-1){
                    count += mat[row.get(i)][col.get(j)];
                }
            }
        }

        return count;
    }


    public int[][] matrixBlockSum(int[][] mat, int k) {

        int [][] arr = new int [mat.length][mat[0].length];

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                ArrayList<Integer> row = makeArrayList(i, k);
                ArrayList<Integer> col = makeArrayList(j, k);

                arr[i][j] = valueGiver(row, col, mat);
            }
        }

        return arr;
    }
}

public class DSA_LeetCode_1314 {
    public static void main(String[] args) {

    }
}
