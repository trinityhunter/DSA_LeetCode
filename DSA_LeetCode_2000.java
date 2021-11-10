package com.company;

class Solution2000 {
    public static String reverseString(char [] str){

        for(int i=0; i<str.length/2; i++){
            char temp = str[i];
            str[i] = str[str.length-1-i];
            str[str.length-1-i] = temp;
        }

        return String.valueOf(str);
    }

    public String reversePrefix(String word, char ch) {

        int ans = word.indexOf(ch);

        return reverseString(word.substring(0, ans+1).toCharArray()) + word.substring(ans+1, word.length());
    }
}

public class DSA_LeetCode_2000 {
    public static void main(String[] args) {

    }
}
