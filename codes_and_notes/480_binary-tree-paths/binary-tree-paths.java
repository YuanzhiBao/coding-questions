/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/binary-tree-paths
@Language: Java
@Datetime: 16-07-22 22:44
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
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    private List<String> path;
    
    public List<String> binaryTreePaths(TreeNode root) {
        // Write your code here
        path = new ArrayList<>();
        if (root != null){
            traverse(root, String.valueOf(root.val));
        }
        return path;
    }
    
    private void traverse(TreeNode root, String curPath){
    if (root != null){  
        //as the input for parameter root is null, we reach athe end of one branch----the leaf.
        if (root.left ==null && root.right ==null){
             this.path.add(curPath); 
             return;
        }  
        if (root.left!=null){
            this.traverse(root.left,curPath + "->" + String.valueOf(root.left.val));
        }
        if (root.right!=null){
            this.traverse(root.right, curPath+ "->" + String.valueOf(root.right.val));
        }
        
    }
    }
}
