/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/reference
@Language: Java
@Datetime: 16-07-27 19:32
*/

/**
 * Definition of Node:
 * class Node {
 *     public int val;
 *     public Node(int val) {
 *         this.val = val;
 *     }
 * }
 */
public class ReferenceManager {
    public Node node;

    public void copyValue(Node obj) {
        // copy value from obj to node
        this.node = new Node(obj.val);
        //this.node.val = obj.val;
    }

    public void copyReference(Node obj) {
        // copy reference from obj to node
        this.node = obj;
    }
}