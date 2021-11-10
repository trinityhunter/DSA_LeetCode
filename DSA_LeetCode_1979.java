package com.company;

class Solution1979 {
    public static int max(int [] nums){
        int max = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }

    public static int min(int [] nums){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }

    public static int gcd(int max, int min){
        if (max == 0){
            return min;
        }
        if (min == 0){
            return max;
        }

        if (max == min){
            return max;
        }

        if (max > min){
            return gcd(max-min, min);
        }
        return gcd(max, min-max);
    }

    public int findGCD(int[] nums) {
        int max = max(nums);
        int min = min(nums);

        return gcd(max, min);
    }
}

public class DSA_LeetCode_1979 {
    public static void main(String[] args) {

    }
}
