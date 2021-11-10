package com.company;

class Solution1816 {
    public String truncateSentence(String s, int k) {
        int count = 0;
        int index = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) - ' ' == 0){
                count++;
                if(count==k){
                    index = i;
                }
            }

        }
        if(index==0){
            return s;
        }
        return s.substring(0, index);
    }
}

public class DSA_LeetCode_1816 {
    public static void main(String[] args) {

    }
}
