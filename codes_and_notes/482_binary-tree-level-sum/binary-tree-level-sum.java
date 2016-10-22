/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/binary-tree-level-sum
@Language: Java
@Datetime: 16-07-15 00:24
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
     * @param level the depth of the target level
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
    
    public void findDepth(List<Integer> nums, int currlevel, TreeNode root, int level) {
        if (root != null) {
            if (currlevel == level) {
                nums.add(root.val);
               // print(nums);
            }
            findDepth(nums, currlevel+1, root.left, level);
            findDepth(nums, currlevel+1, root.right, level);
            
        }
    }
        
    
    public int levelSum(TreeNode root, int level) {
        // Write your code
        List<Integer> nums = new ArrayList<Integer> ();
        int currlevel = 1;
        findDepth(nums, currlevel, root, level);
        int a = 0;
        a = sumDepth(nums);
        return a;
    }
}