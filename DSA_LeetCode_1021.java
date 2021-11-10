package com.company;

import java.util.Stack;

class Solution1021 {
    public String removeOuterParentheses(String s) {
        char []arr = new char[s.length()];
        for(int i=0; i<arr.length; i++){
            arr[i] = s.charAt(i);
        }
        Stack<Character> st = new Stack<>();

        StringBuilder str = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='(')
            {
                if(st.size()>=1)
                {
                    str.append(arr[i]);
                }
                st.push(arr[i]);
            }
            else{
                if(st.size()>1)
                {
                    str.append(arr[i]);
                }
                st.pop();
            }
        }
        return str.toString();
    }
}

public class DSA_LeetCode_1021 {
    public static void main(String[] args) {

    }
}
