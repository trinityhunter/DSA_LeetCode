package com.company;


//  Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carryover = 0;
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int a = 0;
        int b = 0;
        while(l1!=null || l2!=null){
            if(l1==null){
                a = 0;
            }
            else{
                a = l1.val;
            }
            if(l2==null){
                b = 0;
            }
            else{
                b = l2.val;
            }
            sum = carryover + a + b;
            carryover = sum / 10;
            int remain = sum % 10;
            curr.next = new ListNode(remain);
            curr = curr.next;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        if(carryover>0){
            curr.next = new ListNode(carryover);
        }
        return ans.next;
    }
}


public class DSA_LeetCode_2 {
    public static void main(String[] args) {

    }
}
