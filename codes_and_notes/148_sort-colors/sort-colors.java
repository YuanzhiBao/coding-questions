/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/sort-colors
@Language: Java
@Datetime: 16-07-26 19:36
*/

class Solution {
    /**
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // write your code here
        quicksorthelper(nums);
    }
    
    public void quicksorthelper(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
    }
    
    public void quicksort(int[] nums, int begin, int end) {
        if (begin >= end) {
            return;
        }
        
        int i = begin;
        int j = end;
        int pivot = begin + (end - begin)/2;
        int middle = nums[pivot];
        while (i <= j) {
            while (i <= j && nums[i] < middle) {
                i++;
            }
            while (i <= j && nums[j] > middle) {
                j--;
            }
            if (i <= j) {
                swap(nums, i, j);
                i++;
                j--;
            }
        }
        quicksort(nums, begin, j);
        quicksort(nums, i, end);
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}