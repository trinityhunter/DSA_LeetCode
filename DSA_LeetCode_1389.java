package com.company;
import java.util.ArrayList;

class Solution1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<Integer> (nums.length);
        int [] ans = new int [nums.length];

        for(int i=0; i<nums.length; i++){
            arr.add(index[i], nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}

public class DSA_LeetCode_1389 {
    public static void main(String[] args) {

    }
}
