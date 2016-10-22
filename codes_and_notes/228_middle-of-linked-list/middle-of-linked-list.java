/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/middle-of-linked-list
@Language: Java
@Datetime: 16-07-28 14:35
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
     * @return: a middle node of the linked list
     */
    public ListNode middleNode(ListNode head) { 
        // Write your code here
        ListNode dummy = new ListNode(-1);
        ListNode curr = head;
        dummy.next = curr;
        int a = 1;
        while (curr != null) {
            curr = curr.next;
            a++;
        }
        //System.out.println(a);
        a = a/2;
        curr = head;
        while (--a > 0) {
            curr = curr.next;
        }
        return curr;
    }
}