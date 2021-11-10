package com.company;

import java.util.ArrayList;

class Solution1446 {
    public int maxPower(String s) {
        // int power = 1;
        // int max = 1;
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // for(int i=0; i<s.length()-1; i++){
        //     if(s.charAt(i)==s.charAt(i+1)){
        //         power++;
        //     }
        //     else{
        //         if(power>max){
        //             max = power;
        //             arr.add(max);
        //         }
        //         power = 1;
        //     }
        // }
        // return max;

        char arr[]=s.toCharArray();
        ArrayList<Integer> ls= new ArrayList<Integer>();
        int count=1,max=1;
        for(int i=0;i<arr.length;i++)
        {
            if((i+1!=arr.length) && (arr[i]==arr[i+1]))
                count++;
            else
            {
                if(max<count)
                    max=count;
                ls.add(count);
                count=1;
            }
        }
        return max;

    }
}

public class DSA_LeetCode_1446 {
    public static void main(String[] args) {

    }
}
