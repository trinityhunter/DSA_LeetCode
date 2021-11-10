package com.company;

class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
//         int max = 0;
//         int count = 0;
//         if(nums.length==1){
//             return nums[0];
//         }

//         for(int i=0; i<nums.length; i++){
//             if(nums[i]==1){
//                 count++;
//             }
//             else{
//                 if(count>max){
//                     max = count;
//                     count = 0;
//                 }
//             }

//         }
//         return Math.max(count, max);
        int count=0,max=0;
        for (int i=0; i<nums.length; i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else
            {
                max=Math.max(max,count);
                count=0;
            }
        }
        return Math.max(count,max);
    }
}

public class DSA_LeetCode_485 {
    public static void main(String[] args) {

    }
}
