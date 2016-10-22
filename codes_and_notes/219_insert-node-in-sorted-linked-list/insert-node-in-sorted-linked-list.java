/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/insert-node-in-sorted-linked-list
@Language: Java
@Datetime: 16-07-06 21:44
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
     * @param head: The head of linked list.
     * @param val: an integer
     * @return: The head of new linked list
     */
    public ListNode insertNode(ListNode head, int val) { 
        // Write your code here
        // ListNode p = head;
        // if (head == null) {
        //     ListNode temp = new ListNode(val);
        //     ListNode head1 = temp;
        //     head1.next = head;
        //     return head1;
        // }
        // //ListNode q = head.next;
        // while (p != null) {
        //     if (p.val >= val) {
        //         ListNode temp = new ListNode(val);
        //         ListNode head1 = temp;
        //         head1.next = head;
        //         return head1;
        //     } else if (p.next == null || p.next.val >= val){
        //         ListNode temp = new ListNode(val);
        //         temp.next = p.next;
        //         p.next = temp;
        //         return head;
        //     }
        //     p = p.next;
        // }
        // return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr != null) {
            if (curr.next == null || curr.next.val > val) {
                ListNode temp = new ListNode(val);
                temp.next = curr.next;
                curr.next = temp;
                break;
            }
            curr = curr.next;
        }
        return dummy.next;
    }  
}