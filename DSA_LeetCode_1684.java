package com.company;

class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {

        int ans = 0;

        for(int i=0; i<words.length; i++){
            int count = 0;
            for(int j=0; j<allowed.length(); j++){
                for(int k=0; k<words[i].length(); k++){
                    if(words[i].charAt(k) == allowed.charAt(j)){
                        count++;
                    }
                }
            }

            if(count == words[i].length()){
                ans++;
            }
        }

        return ans;
    }
}

public class DSA_LeetCode_1684 {
    public static void main(String[] args) {

    }
}
