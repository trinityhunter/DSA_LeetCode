package com.company;

import java.util.ArrayList;
import java.util.Collections;

class Solution561 {
    public int arrayPairSum(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            arr.add(nums[i]);
        }

        Collections.sort(arr);

        int count = 0;

        for(int i=0; i<arr.size(); i+=2){
            count += arr.get(i);
        }

        return count;
    }
}

public class DSA_LeetCode_561 {
    public static void main(String[] args) {

    }
}
