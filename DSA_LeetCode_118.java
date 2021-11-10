package com.company;

import java.util.ArrayList;
import java.util.List;

class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            row.add(0, 1);
            for(int j=1; j<row.size()-1; j++){
                row.set(j, row.get(j)+row.get(j+1));
            }
            arr.add(new ArrayList<Integer>(row));
        }
        return arr;
    }
}

public class DSA_LeetCode_118 {
    public static void main(String[] args) {

    }
}
