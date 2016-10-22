/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/a-b-problem
@Language: Java
@Datetime: 16-07-04 23:42
*/

class Solution {
    /*
     * param a: The first integer
     * param b: The second integer
     * return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
        if (b == 0) {
            return a;
        } else {
            return aplusb(a ^ b, (a & b) << 1);
        }
    }
};