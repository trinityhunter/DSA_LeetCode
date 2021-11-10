package com.company;

import java.util.Stack;

class Solution1598 {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<String>();

        for(var log : logs){
            if(log.equals("../")){
                if(st.size()>0){
                    st.pop();
                }
            }
            else if(log.equals("./")){

            }
            else{
                st.push(log);
            }
        }
        return st.size();
    }
}


public class DSA_LeetCode_1598 {
    public static void main(String[] args) {

    }
}
