package com.company;

class Solution1528 {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<indices.length; i++){
            sb.setCharAt(indices[i], s.charAt(i));
        }

        return sb.toString();
    }
}

public class DSA_LeetCode_1528 {
    public static void main(String[] args) {

    }
}
