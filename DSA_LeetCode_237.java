package com.company;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution237 {
    public void deleteNode(ListNode node) {
        if(node!=null && node.next!=null){
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}

public class DSA_LeetCode_237 {
    public static void main(String[] args) {

    }
}
