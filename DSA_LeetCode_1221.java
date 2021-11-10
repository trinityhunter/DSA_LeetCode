package com.company;

class Solution1221 {
    public int balancedStringSplit(String s) {

        int count = 0;

        int lcount = 0;
        int rcount = 0;

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) == 'R'){
                rcount++;
            }
            else if(s.charAt(i) == 'L'){
                lcount++;
            }

            if(lcount == rcount){
                count++;
            }
        }

        return count;
    }
}

public class DSA_LeetCode_1221 {
    public static void main(String[] args) {

    }
}
