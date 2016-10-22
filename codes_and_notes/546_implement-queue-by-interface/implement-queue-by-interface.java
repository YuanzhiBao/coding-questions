/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/implement-queue-by-interface
@Language: Java
@Datetime: 16-07-09 13:22
*/

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

interface InterfaceQueue {
    void push(int val);

    // define an interface for pop method
    /* write your code here */

    int pop();

    // define an interface for top method
    /* write your code here */

    int top();
}

public class MyQueue implements InterfaceQueue {
    /* you can declare your private attributes here */
    public Node first;
    public Node last;

    public MyQueue() {
       // do initialization if necessary
    }

    // implement the push method
    /* write your code here */
    @Override
    public void push(int val) {
        if (last == null) {
            last = new Node(val);
            first = last;
        } else {
            Node node = new Node(val);
            last.next = node;
            node.prev = last;
            last = last.next;
        }
    }


    @Override
    public int pop() {
        /* write your code here */
        int res = -1;
        if (first != null) {
            res = first.val;
            first = first.next;
            if (first == null) {
                last = null;
            } else {
                first.prev = null;
            }
        }
        return res;
    }

    @Override
    public int top() {
        /* write your code here */
        int res = -1;
        if (first != null) {
            res = first.val;
        }
        return res;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue queue = new MyQueue();
 * queue.push(123);
 * queue.top(); will return 123;
 * queue.pop(); will return 123 and pop the first element in the queue
 */