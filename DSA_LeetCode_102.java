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
class Solution102 {
    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);

        int rh = height(root.right);

        int th = Math.max(lh, rh) + 1;

        return th;
    }

    public static void rec(List<List<Integer>> arr, TreeNode root, int index){
        if(root == null){
            return;
        }

        arr.get(index).add(root.val);
        rec(arr, root.left, index+1);
        rec(arr, root.right, index+1);
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();

        int h = height(root);

        for(int i=0; i<h; i++){
            arr.add(new ArrayList<Integer>());
        }

        rec(arr, root, 0);

        return arr;
    }
}

public class DSA_LeetCode_102 {
    public static void main(String[] args) {

    }
}
