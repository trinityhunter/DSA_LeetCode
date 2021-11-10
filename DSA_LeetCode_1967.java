package com.company;

class Solution1967 {
    public int numOfStrings(String[] patterns, String word) {

        int count = 0;

        for(int i=0; i<patterns.length; i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }

        return count;
    }
}

public class DSA_LeetCode_1967 {
    public static void main(String[] args) {

    }
}
