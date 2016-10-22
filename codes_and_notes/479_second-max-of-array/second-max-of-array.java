/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/second-max-of-array
@Language: Java
@Datetime: 16-07-05 00:55
*/

public class Solution {
    /**
     * @param nums: An integer array.
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        /* your code */
        int max = nums[1];
        int second = nums[0];
        if (nums[0] >= nums[1]) {
            max = nums[0];
            second = nums[1];
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] >= max) {
                second = max;
                max = nums[i];
            }else if (nums[i] < max && nums[i] >= second) {
                second = nums[i];
            }
        }
        return second;
    }
}