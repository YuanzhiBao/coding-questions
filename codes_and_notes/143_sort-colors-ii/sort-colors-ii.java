/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/sort-colors-ii
@Language: Java
@Datetime: 16-07-26 20:02
*/

class Solution {
    /**
     * @param colors: A list of integer
     * @param k: An integer
     * @return: nothing
     */
    public void sortColors2(int[] colors, int k) {
        // write your code here
        int[] count = new int[k];
        for (int i = 0; i < colors.length ; i++) {
            count[colors[i] - 1]++;
        }
        // int a = 0;
        // while (a < count.length) {
        //     System.out.println(count[a++]);
        // }
        int index = 0;
        for (int i = 0; i < k; i++) {
            int nums = 0;
            while (nums < count[i]) {
                colors[index] = i + 1;
                index++;
                nums++;
            }
        }
    }
}