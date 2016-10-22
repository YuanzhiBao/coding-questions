/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/palindrome-number
@Language: Java
@Datetime: 16-07-05 19:59
*/

public class Solution {
    /**
     * @param num a positive number
     * @return true if it's a palindrome or false
     */
    public boolean palindromeNumber(int num) {
        // Write your code here
        int res = 0;
        int temp;
        int oldnum = num;
        while (num != 0) {
            temp = num % 10;
            num /= 10;
            res = res * 10 + temp;
        }
        return res == oldnum;
    }
}