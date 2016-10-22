/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/char-to-integer
@Language: Java
@Datetime: 16-07-05 03:50
*/

public class Solution {
    /**
     * @param character a character
     * @return an integer
     */
    public int charToInteger(char character) {
        // Write your code here
        return character - '\0';
    }
}