/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/convert-array-list-to-linked-list
@Language: Java
@Datetime: 16-07-25 19:29
*/

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param nums an integer array list
     * @return the first node of linked list
     */
    public ListNode toLinkedList(ArrayList<Integer> nums) {  
        // Write your code here
        // ListNode dummy = new ListNode(-1);
        // ListNode curr = dummy;
        // for (int i = 0; i < nums.size(); i++) {
        //     curr.next = new ListNode(nums.get(i));
        //     curr = curr.next;
        // }
        // return dummy.next;
        ListNode head = null;
        ListNode p = null;
        if (nums.size() > 0) {
            p = new ListNode(nums.get(0));
            head = p;
        } else {
            return head;
        }
        //ListNode q = p;
        for (int i = 1; i < nums.size(); i++) {
            p.next = new ListNode(nums.get(i));
            p = p.next;
        }
        return head;
    }
}
