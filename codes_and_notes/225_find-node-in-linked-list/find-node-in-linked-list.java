/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/find-node-in-linked-list
@Language: Java
@Datetime: 16-07-06 21:18
*/

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param head: the head of linked list.
     * @param val: an integer
     * @return: a linked node or null
     */
    public ListNode findNode(ListNode head, int val) { 
        // Write your code here
        while (head != null) {
            if (head.val == val) {
                return head;
            } else {
                head = head.next;
            }
        }
        return null;
    }  
}