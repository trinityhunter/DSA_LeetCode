package com.company;

import java.util.ArrayList;

class Solution1832 {
    public boolean checkIfPangram(String sentence) {

        if(sentence.length()<26){
            return false;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<=26; i++){
            arr.add(i);
        }

        for(int i=0; i<sentence.length(); i++){
            int num = sentence.charAt(i) - 'a' + 1;
            if(num>=1 && num<=26 && arr.contains(num)){
                arr.remove(new Integer(num));
            }
        }

        if(arr.size()==0){
            return true;
        }

        return false;
    }
}

public class DSA_LeetCode_1832 {
    public static void main(String[] args) {

    }
}
