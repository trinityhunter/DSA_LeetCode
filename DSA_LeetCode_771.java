package com.company;

class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        for(int i=0; i<jewels.length(); i++){
            for(int j=0; j<stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
        }

        return count;
    }
}

public class DSA_LeetCode_771 {
    public static void main(String[] args) {

    }
}
