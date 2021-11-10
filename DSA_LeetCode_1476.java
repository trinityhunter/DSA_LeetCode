package com.company;

class SubrectangleQueries1476 {

    static int [][] arr;

    public SubrectangleQueries1476(int[][] rectangle) {
        arr = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {

        // int [][] arr = new int [row2-row1][col2-col1];

        for(int i=row1; i<=row2; i++){
            for(int j=col1; j<=col2; j++){
                arr[i][j] = newValue;
            }
        }

    }

    public int getValue(int row, int col) {
        return arr[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */

public class DSA_LeetCode_1476 {
    public static void main(String[] args) {

    }
}
