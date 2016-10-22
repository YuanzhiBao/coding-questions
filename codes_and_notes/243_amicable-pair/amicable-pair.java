/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/amicable-pair
@Language: Java
@Datetime: 16-07-28 14:05
*/

public class Solution {
    /**
     * @param k an integer
     * @return all amicable pairs
     */
    public int factorSum(int n) {
        int sum = 1, i;
        for (i = 2; i*i < n; i++) {
            if (n % i == 0) {
                sum += i + n/i;
            }
        }
        if (i * i == n) {
            sum += i;
        }
        return sum;
    }
    
    public List<List<Integer>> amicablePair(int k) {
        // Write your code here
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 2; i < k; i++) {
            int amicable = factorSum(i);
            if (amicable <= i || amicable > k) {
                continue;
            }
            if (factorSum(amicable) == i) {
                List<Integer> pair = new ArrayList<Integer>();
                pair.add(i);
                pair.add(amicable);
                res.add(pair);
            }
        }
        return res;
    }
}