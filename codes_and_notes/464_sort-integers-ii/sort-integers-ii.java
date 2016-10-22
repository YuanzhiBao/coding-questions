/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/sort-integers-ii
@Language: Java
@Datetime: 16-07-23 19:52
*/

public class Solution {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers2(int[] A) {
        // Write your code here
       // System.out.println(A.length-1);
        quicksort(A, 0, A.length-1);
        
    }
    
    public void quicksort(int[] A, int begin, int end) {
            partition(A, 0, A.length-1);
    }
    
    public void partition(int[] A, int begin, int end) {
        if (begin < end) {
         
        int middle = begin + (end - begin)/2;
        int pivot = A[middle];
        int i = begin;
        int j = end;
        while (i <= j) {
            while (A[i] < pivot && i <=j ) {
                i++;
            }
            while (A[j] > pivot && i<=j ) {
                j--;
            }
            if (i <= j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
        if( j <= end) {
            partition(A, begin, j);
        }
        if( i >= begin) {
            partition(A, i, end);
        }
        }
    }
}