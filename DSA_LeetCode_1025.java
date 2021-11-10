package com.company;

import java.util.Stack;

class Solution1025 {
    public boolean divisorGame(int n) {
        Stack<Integer> st = new Stack<>();

        for(int i=1; i<n; i++){
            st.push(i);
        }

        int count = 0;

        while(st.size()>0){
            st.pop();
            count++;
        }
        if(count%2==1){
            return true;
        }
        return false;
    }
}

public class DSA_LeetCode_1025 {
    public static void main(String[] args) {

    }
}
