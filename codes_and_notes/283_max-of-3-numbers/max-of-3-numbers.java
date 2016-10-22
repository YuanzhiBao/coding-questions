/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/max-of-3-numbers
@Language: Java
@Datetime: 16-07-05 03:58
*/

public class Solution {
    /**
     * @param num1 an integer
     * @param num2 an integer
     * @param num3 an integer
     * @return an integer
     */
    public int maxOfThreeNumbers(int num1, int num2, int num3) {
        // Write your code here
        int max = num1;
        if (max < num2) {
            max = num2;
        } 
        if (max < num3) {
            max = num3;
        }
        return max;
    }
}