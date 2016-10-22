/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/validate-binary-search-tree
@Language: Java
@Datetime: 16-07-17 15:31
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
     * @return: True if the binary tree is BST, or false
     */
    public boolean ifReachedBottomLeft = false;
    int prev = Integer.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        // write your code here
        if (root == null) {
            return true;
        }

        if (!isValidBST(root.left) ) {
            return false;
        } 

        // do something
        if (ifReachedBottomLeft == true && prev >= root.val) {
            return false;
        }

        ifReachedBottomLeft = true;
        prev = root.val;


        if (!isValidBST(root.right) ) {
            return false;
        }

        return true;
        
    }
}