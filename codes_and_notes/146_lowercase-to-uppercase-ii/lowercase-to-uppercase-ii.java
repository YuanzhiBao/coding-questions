/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/lowercase-to-uppercase-ii
@Language: Java
@Datetime: 16-07-06 02:11
*/

public class Solution {
    /**
     * @param str a string
     * @return a string
     */
    public String lowercaseToUppercase2(String str) {
        // Write your code here
        int len = str.length();
        String lowercase = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a') {
                int b = str.charAt(i) + ('A' - 'a');
                char c = (char) b;
                lowercase += c;
            } else {
                lowercase += str.charAt(i);
            }
        }
        return lowercase;
    }
}