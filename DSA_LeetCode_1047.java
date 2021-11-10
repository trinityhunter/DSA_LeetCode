package com.company;

import java.util.Stack;

class Solution1047 {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));

        for(int i=1; i<s.length(); i++){
            if(st.size()>0 && s.charAt(i)==st.peek()){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(st.size()>0){
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();
    }
}

public class DSA_LeetCode_1047 {
    public static void main(String[] args) {

    }
}
