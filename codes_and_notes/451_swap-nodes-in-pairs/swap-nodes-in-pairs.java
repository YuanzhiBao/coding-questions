/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/swap-nodes-in-pairs
@Language: Java
@Datetime: 16-07-28 18:13
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param head a ListNode
     * @return a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // Write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while (head.next != null && head.next.next != null) {
            ListNode n1 = head.next;
            ListNode n2 = head.next.next;
            head.next = n2;
            n1.next = n2.next;
            n2.next = n1;
            
            head = n1;
        }
        return dummy.next;
    }
}