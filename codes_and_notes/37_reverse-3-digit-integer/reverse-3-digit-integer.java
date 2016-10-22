/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/reverse-3-digit-integer
@Language: Java
@Datetime: 16-07-05 04:06
*/

class Solution {
    /*
     * param number: A 3-digit number.
     * return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        int a;
        int b;
        int c;
        a = number / 100;
        b = (number % 100) / 10;
        c = number % 10;
        return c * 100 + b * 10 + a;
    }
};
