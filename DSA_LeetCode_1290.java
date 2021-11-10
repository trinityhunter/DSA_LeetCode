package com.company;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution1290 {
    public int getDecimalValue(ListNode head) {

        int ans = head.val;

        while(head.next != null){
            ans = ans * 2 + head.next.val;
            head = head.next;
        }
        return ans;
    }
}

public class DSA_LeetCode_1290 {
    public static void main(String[] args) {

    }
}
