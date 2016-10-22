/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/insertion-sort-list
@Language: Java
@Datetime: 16-07-26 16:37
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
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        ListNode dummy = new ListNode(0);
        ListNode curr = null;
        while (head != null) {
            curr = dummy;
            while (curr.next != null && curr.next.val < head.val) {
                curr = curr.next;
            }
            ListNode temp = head;
            head = head.next;
            temp.next = curr.next;
            curr.next = temp;
        }
        return dummy.next;
    }
}