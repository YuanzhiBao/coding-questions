/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/delete-node-in-the-middle-of-singly-linked-list
@Language: Java
@Datetime: 16-07-28 20:10
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
     * @param node: the node in the list should be deleted
     * @return: nothing
     */
    public void deleteNode(ListNode node) {
        // write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = node;
        ListNode curr = dummy;
        while (curr.next.next != null) {
            curr.next.val = curr.next.next.val;
            curr = curr.next;
        }
        curr.next = null;
    }
}