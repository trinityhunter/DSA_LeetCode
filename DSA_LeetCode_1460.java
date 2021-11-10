package com.company;

import java.util.Arrays;

class Solution1460 {
    public boolean canBeEqual(int[] target, int[] arr) {

        Arrays.sort(arr);
        Arrays.sort(target);

        for(int i=0; i<target.length; i++){
            if(target[i] != arr[i]){
                return false;
            }
        }

        return true;
    }
}

public class DSA_LeetCode_1460 {
    public static void main(String[] args) {

    }
}
