package com.company;

class Solution806 {
    public int[] numberOfLines(int[] widths, String s) {
        int [] result = new int [2];
        int count = 0;
        int power = 1;
        char arr[]=s.toCharArray();

        for(int i=0; i<s.length(); i++){
            if(count+ widths[arr[i]%97]<=100){
                count = count + widths[arr[i]%97];
            }
            else{
                power++;
                count = widths[arr[i]%97];;

            }
        }
        result[0] = power;
        result[1] = count;
        return result;
    }
}

public class DSA_LeetCode_806 {
    public static void main(String[] args) {

    }
}
