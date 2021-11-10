package com.company;

import java.util.Stack;

class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums2.length];

        Stack<Integer> st = new Stack<>();

        st.push(nums2[nums2.length - 1]);
        ans[nums2.length - 1] = -1;

        for(int i=nums2.length-2; i>=0; i--){
            while(st.size() > 0 && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(nums2[i]);
        }
        int result[] = new int[nums1.length];

        for(int i = 0; i < result.length ; i++){
            for(int j = 0 ; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    result[i] = ans[j];
                    break;
                }

            }
        }
        return result;
    }
}

public class DSA_LeetCode_496 {
    public static void main(String[] args) {

    }
}
