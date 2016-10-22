/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/root-of-equation
@Language: Java
@Datetime: 16-07-27 13:47
*/

public class Solution {
    /**
     * @param a, b, c: parameters of the equation
     * @return a double array, contains at most two root
     */
    public double[] rootOfEquation(double a, double b, double c) {
        // Write your code here
        double d = b*b - 4*a*c;
        if (d < 0) {
            double[] res = new double[0];
            return res;
        } else if (d == 0) {
            double[] res = new double[1];
            res[0] = (-b) / (2 * a);
            return res;
        } else {
            double[] res = new double[2];
            double res1 = ((-b) - Math.sqrt(d)) / (2 * a);
            double res2 = ((-b) + Math.sqrt(d)) / (2 * a);
            res[0] = (res1 > res2) ? res2 : res1;
            res[1] = (res1 > res2) ? res1 : res2;
            // res[0] = ((-b) - Math.sqrt(d)) / (2 * a);
            // res[1] = ((-b) + Math.sqrt(d)) / (2 * a);
            return res;
        }
        //return res;
    }
}