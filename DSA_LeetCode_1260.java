package com.company;

import java.util.ArrayList;
import java.util.List;

class Solution1260 {
    public static int [][] shift(int [][] grid){

        int [][] newGrid = new int [grid.length][grid[0].length];

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(i==0 && j==0){
                    newGrid[i][j] = grid[grid.length-1][grid[0].length-1];
                }
                else if(j==0){
                    newGrid[i][j] = grid[i-1][grid[0].length-1];
                }
                else{
                    newGrid[i][j] = grid[i][j-1];
                }
            }
        }

        return newGrid;
    }


    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        List<List<Integer>> arr = new ArrayList<>();

        for(int i=0; i<k; i++){
            grid = shift(grid);
        }

        for(int i=0; i<grid.length; i++){
            ArrayList<Integer> arr1 = new ArrayList<>();
            for(int j=0; j<grid[0].length; j++){
                arr1.add(grid[i][j]);
            }
            arr.add(arr1);
        }
        return arr;
    }
}

public class DSA_LeetCode_1260 {
    public static void main(String[] args) {

    }
}
