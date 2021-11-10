package com.company;

import java.util.ArrayList;
import java.util.List;

class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);

        int max = candies[0];

        for(int i=1; i<candies.length; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }

        for(int j=0; j<candies.length; j++){
            if(candies[j] + extraCandies>=max){
                result.add(true);
                // break;
            }
            else{
                result.add(false);
                // break;
            }
        }return result;
    }
}



public class DSA_LeetCode_1431 {
    public static void main(String[] args) {

    }
}
