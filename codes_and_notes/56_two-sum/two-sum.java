/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/two-sum
@Language: Java
@Datetime: 16-07-17 15:37
*/

public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int res[] = new int[2];
        if (numbers.length == 0) {
            return res;
        }
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (hash.containsKey(numbers[i]) ) {
                res[0] = hash.get(numbers[i]) + 1;
                res[1] = i + 1;
                break;
            }
            hash.put(target - numbers[i], i);
        }
        return res;
    }
}