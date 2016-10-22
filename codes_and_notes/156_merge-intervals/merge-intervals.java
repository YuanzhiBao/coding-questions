/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/merge-intervals
@Language: Java
@Datetime: 16-07-26 15:06
*/

/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

class Solution {
    /**
     * @param intervals, a collection of intervals
     * @return: A new sorted interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        //Iterator each = intervals.iterator();
        //System.out.println(intervals.size());
        //return intervals;
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        } 
        
        Collections.sort(intervals, new Comparator<Interval> () {
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
        
        List<Interval> res = new ArrayList<Interval>();
        Interval prev = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (curr.start > prev.end) {
                res.add(prev);
                prev = curr;
            } else {
                prev.end = Math.max(prev.end, curr.end);
            }
        }
        
        res.add(prev);
        return res;
    }

}