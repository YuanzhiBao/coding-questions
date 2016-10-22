/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/insert-node-in-a-binary-search-tree
@Language: Java
@Datetime: 16-07-17 15:26
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
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null) {
            return node;
        }
        TreeNode curr = root;
        TreeNode prev = null;
        while (curr != null) {
            prev = curr;
            if (node.val < curr.val) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        if (node.val < prev.val) {
            prev.left = node;
        } else {
            prev.right = node;
        }
        return root;
    }
}