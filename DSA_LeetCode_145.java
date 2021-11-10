package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution145 {
    public static void rec(TreeNode root, List<Integer> arr){
        if(root != null){
            if(root.left != null){
                rec(root.left, arr);
            }

            if(root.right != null){
                rec(root.right, arr);
            }

            arr.add(root.val);
        }
    }


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();

        rec(root, arr);

        return arr;
    }
}

public class DSA_LeetCode_145 {
    public static void main(String[] args) {

    }
}
