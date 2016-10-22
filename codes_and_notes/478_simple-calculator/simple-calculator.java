/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/simple-calculator
@Language: Java
@Datetime: 16-07-05 03:46
*/

public class Calculator {
    /**
      * @param a, b: Two integers.
      * @param operator: A character, +, -, *, /.
      */
    public int calculate(int a, char operator, int b) {
        /* your code */
        int c = 0;
        if (operator == '+') {
            c = a + b;
        } else if (operator == '-') {
            c = a - b;
        } else if (operator == '*') {
            c = a * b;
        } else if (operator == '/') {
            c = a / b;
        }
        return c;
    }
}