package com.company;

class Solution1828 {
    public int[] countPoints(int[][] points, int[][] queries) {

        int count = 0;

        int [] arr = new int [queries.length];

        for(int i=0; i<queries.length; i++){
            for(int j=0; j<points.length; j++){
                // double dist1 = (double)Math.pow(points[j][0]*points[j][0] + points[j][1]*points[j][1], 0.5);
                // double dist2 = (double)Math.pow(queries[i][0]*queries[i][0] + queries[i][1]*queries[i][1], 0.5);
                // if(Math.abs(dist1-dist2)<=(float)Math.pow(queries[i][2] * queries[i][2], 0.5)){
                if(queries[i][2] >= Math.sqrt(Math.pow(points[j][0] - queries[i][0],2) + Math.pow(points[j][1] - queries[i][1],2))){
                    count++;
                }
            }
            arr[i] = count;
            count = 0;
        }
        return arr;
    }
}

public class DSA_LeetCode_1828 {
    public static void main(String[] args) {

    }
}
