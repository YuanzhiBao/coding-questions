/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/binary-tree-path-sum
@Language: Java
@Datetime: 16-07-15 13:49
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
     * @param root the root of binary tree
     * @param target an integer
     * @return all valid paths
     */
     //前序遍历递归把每条能到底的路径都存起来，最后验证其中和等于要求的和的路劲将其打印出来。
    public Integer getSum(List<Integer> path) {
        int a = 0;
        for(int i = 0; i < path.size(); i++) {
            a += path.get(i);
        }
        return a;
    }

    public void getRightPath(List<List<Integer>> res,List<List<Integer>> res1, int target) {
        
        for (int i = 0; i < res1.size(); i++) {
           if (getSum(res1.get(i)) == target) {
                res.add(new ArrayList<Integer>(res1.get(i)));
           }
        }
        
    }

//遍历不一定都要有返回值，可以外围一个if， 如果到底了就不再往下走了。 然后在递归的过程中进行操作。
    public void getAllPath(List<List<Integer>> res1, List<Integer> path,TreeNode root) {
        if (root != null) {
        List<Integer> path1 = new ArrayList<Integer>(path);
        
        path1.add(root.val);

        getAllPath(res1, path1, root.left);
        if (root.left == null && root.right == null) {
            res1.add(new ArrayList<Integer>(path1));
        }
        getAllPath(res1, path1, root.right);
        }
    }

    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // Write your code here

        List<List<Integer>> res1 = new ArrayList<List<Integer>> ();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) {
            return res;
        }
        List<Integer> path = new ArrayList<Integer> ();
        //path.add(root.val);
        getAllPath(res1, path, root);
        getRightPath(res, res1, target);
        return res;
    }
}