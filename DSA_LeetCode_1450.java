package com.company;

class Solution1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;

        for(int i=0; i<startTime.length; i++){
            if(startTime[i] <= queryTime && queryTime <= endTime[i]){
                count++;
            }
        }
        return count;
    }
}

public class DSA_LeetCode_1450 {
    public static void main(String[] args) {

    }
}
