package com.company;

import java.util.ArrayList;

class Solution905 {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();

        ArrayList<Integer> odd = new ArrayList<>();

        int oddCount = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
                oddCount++;
            }
        }

        for(int i=0; i<oddCount; i++){
            even.add(odd.get(i));
        }

        int [] ans = new int [nums.length];

        for(int i=0; i<nums.length; i++){
            ans[i] = even.get(i);
        }

        return ans;
    }
}

public class DSA_LeetCode_905 {
    public static void main(String[] args) {

    }
}
