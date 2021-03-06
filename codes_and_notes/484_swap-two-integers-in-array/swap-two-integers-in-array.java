/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/swap-two-integers-in-array
@Language: Java
@Datetime: 16-07-05 21:24
*/

public class Solution {
    /**
     * @param A an integer array
     * @param index1 the first index
     * @param index2 the second index
     * @return void
     */
    public void swapIntegers(int[] A, int index1, int index2) {
        // Write your code here
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
}