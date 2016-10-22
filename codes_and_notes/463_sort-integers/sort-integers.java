/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/sort-integers
@Language: Java
@Datetime: 16-07-23 15:46
*/

public class Solution {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers(int[] A) {
        // Write your code here
        for ( int i = 0; i < A.length; i++) {
            for ( int j = i; j < A.length; j++) {
                if (A[j] < A[i]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }
}