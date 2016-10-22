/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/max-of-array
@Language: Java
@Datetime: 16-07-05 03:56
*/

public class Solution {
    /**
     * @param A a float array
     * @return a float number
     */
    public float maxOfArray(float[] A) {
        // Write your code here
        float Max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (Max <= A[i]) {
                Max = A[i];
            }
        }
        return Max;
    }
}