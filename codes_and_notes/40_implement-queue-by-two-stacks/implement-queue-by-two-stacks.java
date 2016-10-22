/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/implement-queue-by-two-stacks
@Language: Java
@Datetime: 16-07-09 15:55
*/

public class Queue {
    public Stack<Integer> stack1;
    
    public Stack<Integer> stack2;

   
    public Queue() {
       // do initialization if necessary
       stack1 = new Stack<Integer>();
       stack2 = new Stack<Integer>();
    }
    
    public void push(int element) {
        // write your code here
        stack1.push(element);
    }

    public int pop() {
        // write your code here
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int a = stack2.pop();
        //System.out.println(a);
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return a;
    }

    public int top() {
        // write your code here
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int a = stack2.peek();
        //System.out.println(a);
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return a;
    }
    
}