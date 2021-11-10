package com.company;

class Solution2011 {
    public int finalValueAfterOperations(String[] operations) {

        int count = 0;

        for(int i=0; i<operations.length; i++){
            if(operations[i].charAt(1) == '+'){
                count++;
            }
            else{
                count--;
            }
        }

        return count;
    }
}

public class DSA_LeetCode_2011 {
    public static void main(String[] args) {

    }
}
