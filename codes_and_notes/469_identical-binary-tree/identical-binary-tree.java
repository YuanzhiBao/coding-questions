/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/identical-binary-tree
@Language: Java
@Datetime: 16-07-16 16:17
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
     * @param a, b, the root of binary trees.
     * @return true if they are identical, or false.
     */
     
    public boolean flag = true;
    
    public void test(TreeNode a, TreeNode b) {
        if (a != null || b != null) {
        if ((a == null && b != null) || (b == null && a != null)) {
            flag = false;
        } else if (a.val != b.val) {
            flag = false;
        } else if (a == null && b == null) {
            flag = flag;
        } else {
            test(a.right, b.right);
            test(a.left, b.left);
        }
        }
    }
    
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
        test(a, b);
        return flag;
    }
}