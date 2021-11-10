package com.company;

import java.util.ArrayList;

//  Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution100 {
    public static void rec(TreeNode root, ArrayList<Integer> arr){
        if(root != null){
            arr.add(root.val);

            if(root.left == null){
                arr.add(0);
            }

            if(root.left != null){
                rec(root.left, arr);
            }

            if(root.right == null){
                arr.add(0);
            }

            if(root.right != null){
                rec(root.right, arr);
            }
        }
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        rec(p, arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        rec(q, arr2);

        if(arr1.equals(arr2)){
            return true;
        }

        return false;
    }
}

public class DSA_LeetCode_100 {
    public static void main(String[] args) {

    }
}
