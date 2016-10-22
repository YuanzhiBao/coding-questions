/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/invert-binary-tree
@Language: Java
@Datetime: 16-07-15 17:14
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
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        if (root != null) {
            TreeNode temp = new TreeNode(-1);
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertBinaryTree(root.left);
            invertBinaryTree(root.right);
        }
    }
}