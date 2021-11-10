package com.company;

//class Solution344 {                           // Using Brute Force
//    public void reverseString(char[] s) {
//        for(int i=0; i<s.length/2; i++){
//            char temp = s[i];
//            s[i] = s[s.length - i - 1];
//            s[s.length - i -1] = temp;
//        }
//    }
//}

class Solution344 {                             // Using Recursion
    public void swap(char [] s, int start, int end){
        if(end<s.length/2){
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        start++;
        s[end] = temp;
        end--;
        swap(s, start, end);
    }

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        swap(s, start, end);
    }
}

public class DSA_LeetCode_344 {
    public static void main(String[] args) {

    }
}
