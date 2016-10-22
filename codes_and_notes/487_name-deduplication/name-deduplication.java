/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/name-deduplication
@Language: Java
@Datetime: 16-07-16 16:06
*/

public class Solution {
    /**
     * @param names a string array
     * @return a string array
     */
    public List<String> nameDeduplication(String[] names) {
        // Write your code here
        HashSet<String> uniqueNameSet = new HashSet<String>();
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < names.length; i++) {
            String temp = names[i].toLowerCase();
            if (!uniqueNameSet.contains(temp) ) {
                uniqueNameSet.add(temp);
                res.add(temp);
            }
        }
        return res;
    }
    
}