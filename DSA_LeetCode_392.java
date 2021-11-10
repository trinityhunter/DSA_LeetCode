package com.company;

class Solution392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        if(i==s.length()){
            return true;
        }
        return false;
    }
}


public class DSA_LeetCode_392 {
    public static void main(String[] args) {

    }
}
