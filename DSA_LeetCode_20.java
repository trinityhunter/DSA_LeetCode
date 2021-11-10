package com.company;

import java.util.Stack;

class Solution20 {
    public boolean isValid(String str) {

        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch=='[' || ch=='{' || ch=='('){
                st.push(ch);
            }

            else if(ch==']'){
                if(st.size()==0){
                    return false;
                }

                else if(st.peek()!='['){
                    return false;
                }
                else{
                    st.pop();
                }
            }
            else if(ch=='}'){
                if(st.size()==0){
                    return false;
                }

                else if(st.peek()!='{'){
                    return false;
                }
                else{
                    st.pop();
                }
            }
            else if(ch==')'){
                if(st.size()==0){
                    return false;
                }

                else if(st.peek()!='('){
                    return false;
                }
                else{
                    st.pop();
                }
            }
            else{

            }
        }
        if(st.size()==0){
            return true;
        }
        else{
            return false;
        }

    }
}

public class DSA_LeetCode_20 {
    public static void main(String[] args) {

    }
}
