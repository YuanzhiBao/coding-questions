/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/fibonacci
@Language: Java
@Datetime: 16-07-27 14:01
*/

class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                res[0] = 0;
            } else if (i == 1) {
                res[1] = 1;
            } else {
                res[i] = res[i-1] + res[i-2];
            }
        }
        return res[n-1];
    }
}

