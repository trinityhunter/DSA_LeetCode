package com.company;

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
class Solution111 {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int lhs = minDepth(root.left);
        int rhs = minDepth(root.right);

        int min = Math.min(lhs, rhs);

        if (root.left == null && root.right == null){
            return 1;
        }

        if(root.left == null){
            return rhs + 1;
        }

        if(root.right == null){
            return lhs + 1;
        }

        int tmin = min + 1;
        return tmin;
    }
}

public class DSA_LeetCode_111 {
    public static void main(String[] args) {

    }
}
