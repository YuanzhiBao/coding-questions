/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/lowercase-to-uppercase
@Language: Java
@Datetime: 16-07-06 00:46
*/

public class Solution {
    /**
     * @param character a character
     * @return a character
     */
    public char lowercaseToUppercase(char character) {
        // Write your code here
        int a = character + ('A' - 'a');
        char b = (char) a;
        return b;
    }
}