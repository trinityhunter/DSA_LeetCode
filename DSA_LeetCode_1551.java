package com.company;

class Solution1551 {
    public int minOperations(int n) {

//         int [] arr = new int [n];

//         for(int i=0; i<arr.length; i++){
//             arr[i] = (2*i) + 1;
//         }

        int count = 0;

        for(int i=0; i<n/2; i++){
            // while(arr[i]!=n && arr[arr.length-1-i]!=n){
            //     arr[i] += 1;
            //     arr[arr.length-1-i] -= 1;
            //     count++;
            // }
            count += n-((2*i) + 1);
        }

        return count;
    }
}

public class DSA_LeetCode_1551 {
    public static void main(String[] args) {
        
    }
}
