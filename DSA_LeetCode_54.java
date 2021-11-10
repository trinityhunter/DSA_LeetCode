package com.company;

import java.util.ArrayList;
import java.util.List;

class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        List arr = new ArrayList();

        int tle = m * n;
        int sr = 0, sc = 0;
        int er= m - 1;
        int ec = n - 1;
        int dir = -1;

        while(tle != 0){
            dir = (dir + 1) % 4;

            if(dir==0){
                for(int i=sc; i<=ec; i++){
                    arr.add(matrix[sr][i]);
                    tle--;
                }
                sr++;
            }

            else if(dir==1){
                for(int i=sr; i<=er; i++){
                    arr.add(matrix[i][ec]);
                    tle--;
                }
                ec--;
            }

            else if(dir==2){
                for(int i=ec; i>=sc; i--){
                    arr.add(matrix[er][i]);
                    tle--;
                }
                er--;
            }

            else{
                for(int i=er; i>=sr; i--){
                    arr.add(matrix[i][sc]);
                    tle--;
                }
                sc++;
            }
        }
        return arr;
    }
}

public class DSA_LeetCode_54 {
    public static void main(String[] args) {

    }
}
