/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/valid-parentheses
@Language: Java
@Datetime: 16-07-09 14:50
*/

public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean matchtwocharacter(char a, char b) {
        if (b == ')') {
            return a == '(';
        } else if (b == '}') {
            return a == '{';
        } else {
            return a == '[';
        }
        //return false;
    } 
    
    
    public boolean isValidParentheses(String s) {
        // Write your code here
        Stack<Character> match = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[') {
                match.push(temp);
            } else {
                if (match.empty()) {
                    return false;
                } else {
                    if (!matchtwocharacter(match.pop(), temp)) {
                        return false;
                    }
                }
            }
        }
        return match.empty();
    }
}