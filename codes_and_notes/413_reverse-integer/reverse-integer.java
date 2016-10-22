/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/reverse-integer
@Language: Java
@Datetime: 16-07-27 18:10
*/

public class Solution {
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public int reverseInteger(int n) {
        // Write your code here
        boolean flag = true;
        if (n < 0) {
            flag = false;
        }
        int absN = n;
        if (!flag) {
            absN = Math.abs(n);
        }
        long resN = 0;
        while (absN != 0) {
            int temp = absN % 10;
            absN /= 10;
            resN = resN*10 + temp;
        }
        if (resN > Integer.MAX_VALUE) {
            return 0;
        } else {
            if (!flag) {
             return (int)(-resN);
            }
            else {
                return (int)resN;
            }
        }
    }
}