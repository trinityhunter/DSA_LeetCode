package com.company;

class Solution1342 {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num>0){
            if(num%2==0){
                num = num/2;
                count++;
            }
            else{
                num = num - 1;
                count++;
            }
        }
        return count;
    }
}

public class DSA_LeetCode_1342 {
    public static void main(String[] args) {

    }
}
