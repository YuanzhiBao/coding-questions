/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/balanced-binary-tree
@Language: Java
@Datetime: 16-07-17 15:24
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
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int lHeight = getHeight(root.left);
        int rHeight = getHeight(root.right);

        if (lHeight == -1 || rHeight == -1 || Math.abs(lHeight - rHeight) > 1) {
            return -1;
        }
        
        return Math.max(lHeight, rHeight) + 1;
    } 

    public boolean isBalanced(TreeNode root) {
        // write your code here
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        return getHeight(root) != -1;
    }
    
}