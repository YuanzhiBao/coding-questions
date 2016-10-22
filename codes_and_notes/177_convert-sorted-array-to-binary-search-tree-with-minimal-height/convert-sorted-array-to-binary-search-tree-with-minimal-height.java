/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/convert-sorted-array-to-binary-search-tree-with-minimal-height
@Language: Java
@Datetime: 16-07-17 14:08
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param A: an integer array
     * @return: a tree node
     */
    public TreeNode helper(int[] A, int start, int end) {

        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(A[mid]);

        if (start <= mid - 1) {
            root.left = helper(A, start, mid - 1);
        }

        if (mid + 1 <= end) {
            root.right = helper(A, mid + 1, end);
        }
        return root;
    } 
    
    public TreeNode sortedArrayToBST(int[] A) {  
        // write your code here
        if (A.length == 0) {
            return null;
        }
        return helper(A, 0, A.length - 1);
    }  
    
}
