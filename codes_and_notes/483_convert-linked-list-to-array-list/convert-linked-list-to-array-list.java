/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/convert-linked-list-to-array-list
@Language: Java
@Datetime: 16-07-06 11:14
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
     * @param head the head of linked list.
     * @return an array list
     */
    public List<Integer> toArrayList(ListNode head) {  
        // Write your code here
        List<Integer> a = new ArrayList<Integer> ();
        while (head != null) {
            a.add(head.val);
            head = head.next;
        }
        return a;
    }
}
