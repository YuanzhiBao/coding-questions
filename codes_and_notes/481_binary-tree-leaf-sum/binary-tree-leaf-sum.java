/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/binary-tree-leaf-sum
@Language: Java
@Datetime: 16-07-15 00:33
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
     * @return an integer
     */
     
    public int  sumDepth(List<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum;
    }
    
    public void print(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            System.out.println("right here" + nums.get(i));
        }
    }
    
    public void findDepth(List<Integer> nums, TreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                nums.add(root.val);
               // print(nums);
            }
            findDepth(nums, root.left);
            findDepth(nums, root.right);
            
        }
    }
    public int leafSum(TreeNode root) {
        // Write your code 
        List<Integer> nums = new ArrayList<Integer> ();
        findDepth(nums, root);
        int sum = 0;
        sum = sumDepth(nums);
        return sum;
    }
}