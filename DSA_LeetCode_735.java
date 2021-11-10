package com.company;

import java.util.ArrayList;
import java.util.Stack;

class Solution735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0; i<asteroids.length; i++){
            collision: {
                while(asteroids[i]<0 && st.size()>0 && st.peek()>0){
                    if(Math.abs(asteroids[i]) > st.peek()){
                        st.pop();
                        continue;
                    }
                    else if(st.peek()==Math.abs(asteroids[i])){
                        st.pop();
                    }
                    break collision;
                }
                st.push(asteroids[i]);
            }
        }

        int[] ans = new int[st.size()];
        for (int t = ans.length - 1; t >= 0; --t) {
            ans[t] = st.pop();
        }
        return ans;
    }
}

public class DSA_LeetCode_735 {
    public static void main(String[] args) {

    }
}
