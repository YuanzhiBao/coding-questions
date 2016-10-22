```
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/binary-tree-paths
@Language: Markdown
@Datetime: 16-07-22 22:44
```

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
 
 // get all the paths down to the buttom and print them out
public class Solution {
    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public void getAllPaths(List<List<Integer>> allPaths, List<Integer> path, TreeNode root) {
        if (root != null) {
            List<Integer> path1 = new ArrayList<Integer>(path);
            path1.add(root.val);
            if (root.left == null && root.right == null) {
                allPaths.add(new ArrayList<Integer>(path1));
            }
            getAllPaths(allPaths, path1, root.left);
            getAllPaths(allPaths, path1, root.right);
        }
    }
    
    public List<String> printPath(List<List<Integer>> allPaths) {
        List<String> bPaths = new ArrayList<String>();
        for (int i = 0; i < allPaths.size(); i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < allPaths.get(i).size(); j++) {
                //StringBuilder temp = new StringBuilder();
                String temp1 = Integer.toString(allPaths.get(i).get(j));
                if (j == allPaths.get(i).size() - 1) {
                    temp.append(temp1);
                } else {
                    temp.append(temp1 + "->");
                }
               // System.out.println(temp);
            }
            //System.out.println(temp);
            //System.out.println(temp);
            String fuck = temp.toString();
            bPaths.add(fuck);
        }
        return bPaths;
    }
    
    public void print(List<List<Integer>> allPaths) {
        for (int i = 0; i < allPaths.size(); i++) {
            for (int j = 0; j < allPaths.get(i).size(); j++) {
                System.out.println("here is " + allPaths.get(i).get(j));
            }
        }
    }
    
    
    public List<String> binaryTreePaths(TreeNode root) {
        // Write your code here
        List<String> binaryPaths = new ArrayList<String> ();
        List<List<Integer>> allPaths = new ArrayList<List<Integer>> ();
        List<Integer> path = new ArrayList<Integer> ();
        getAllPaths(allPaths, path, root);
        binaryPaths = printPath(allPaths);
        return binaryPaths;
    }
}