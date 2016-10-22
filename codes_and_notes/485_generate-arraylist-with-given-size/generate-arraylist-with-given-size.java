/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/generate-arraylist-with-given-size
@Language: Java
@Datetime: 16-07-05 21:23
*/

public class Solution {
    /**
     * @param size an integer
     * @return an array list
     */
    public ArrayList<Integer> generate(int size) {
        // Write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= size; i++) {
            result.add(i);
        }
        return result;
    }
}