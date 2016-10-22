/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/narcissistic-number
@Language: Java
@Datetime: 16-07-27 23:33
*/

class Solution {
    /*
     * @param n: The number of digits. 
     * @return: All narcissistic numbers with n digits.
     */
    public ArrayList<Integer> getNarcissisticNumbers(int n) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (n == 1) {
            for (int i = 0; i < 10; ++i)
                result.add(i);
            return result;
        }
        // if (n == 6) {
        //     result.add(548834);
        //     return result;
        // }

        for (int i = pow(10, n-1); i < Math.pow(10, n); ++i) {
            int j = i;
            int s = 0;
            while (j > 0) {
                s += pow((j % 10), n);
                j = j / 10;
            }
            if (s == i)
                result.add(i);
        }
        return result;
    }
    public int pow(int a, int b) {
        int c = 1;
        while (b-- != 0) {
            c = c * a;
        }
        return c;
    }
    
    
}

