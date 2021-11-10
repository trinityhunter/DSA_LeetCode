package com.company;

class Solution1678 {
    public String interpret(String command) {

        String str = "";

        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) == 'G'){
                str += "G";
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                str += "o";
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)=='a' &&                       command.charAt(i+2)=='l' && command.charAt(i+3)==')'){
                str += "al";
            }
        }

        return str;
    }
}

public class DSA_LeetCode_1678 {
    public static void main(String[] args) {

    }
}
