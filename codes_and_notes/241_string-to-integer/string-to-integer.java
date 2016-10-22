/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/string-to-integer
@Language: Java
@Datetime: 16-07-06 00:30
*/

public class Solution {
    /**
     * @param str a string
     * @return an integer
     */
    public int stringToInteger(String str) {
        // Write your code here
        if (str.length() == 0) {
            return 0;
        }
        int res = 0;
        boolean flag = true; 
        int start = 0;
        if (str.charAt(0) == '-') {
            flag = false;
            start++;
        }
        for (int i = start; i < str.length(); i++) {
            int temp = str.charAt(i) - '0';
            res = res * 10 + temp;
        }
        if (!flag) {
            res = -res;
        }
        return res;
    }
}