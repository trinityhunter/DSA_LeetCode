package com.company;

import java.util.Stack;

class Solution682 {
    public int calPoints(String[] ops) {

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<ops.length; i++){
            if(ops[i].equals("C")){
                st.pop();
            }
            else if(ops[i].equals("D")){
                int num =  st.peek();
                st.push(2 * num);
            }
            else if(ops[i].equals("+")){
                Stack<Integer> st1 = (Stack<Integer>)st.clone();

                int num1 = 0;

                num1 += st1.peek();
                st1.pop();

                num1 += st1.peek();

                st.push(num1);

            }
            else{
                st.push(Integer.parseInt(ops[i]));
            }
        }

        int ans = 0;

        while(st.size()>0){
            ans+=st.peek();
            st.pop();
        }

        return ans;
    }
}

public class DSA_LeetCode_682 {
    public static void main(String[] args) {

    }
}
