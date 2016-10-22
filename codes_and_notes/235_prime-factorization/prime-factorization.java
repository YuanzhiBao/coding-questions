/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/prime-factorization
@Language: Java
@Datetime: 16-07-27 21:21
*/

public class Solution {
    /**
     * @param num an integer
     * @return an integer array
     */
    public List<Integer> primeFactorization(int num) {
        // Write your code here
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                num = num / i;
                res.add(i);
            }
        }
        if (num != 1) {
            res.add(num);
        }
        return res;
    }
}