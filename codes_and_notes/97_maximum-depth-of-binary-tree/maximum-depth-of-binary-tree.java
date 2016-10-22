/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/maximum-depth-of-binary-tree
@Language: Java
@Datetime: 16-07-15 18:04
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
     * @return: An integer.
     */
    
    public int Max = 0;
    
     public void findMaxDepth(TreeNode root, int currdepth) {
        if (root != null) {
             if (currdepth >= Max) {
                  Max = currdepth;
             }
            
            findMaxDepth(root.left, currdepth+1);
            findMaxDepth(root.right, currdepth+1);
         }
     }
    
    public int maxDepth(TreeNode root) {
        // write your code here
        int currdepth = 1;
        findMaxDepth(root, currdepth);
        return Max;
    }
}