/*
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/setter-and-getter
@Language: Java
@Datetime: 16-07-05 22:13
*/

public class School {
    /*
     * Declare a private attribute *name* of type string.
     */
    // write your code here
    public String name;
    /**
     * Declare a setter method `setName` which expect a parameter *name*.
     */
    // write your code here
    public void setName(String hisname) {
        name = hisname;
    }
    /**
     * Declare a getter method `getName` which expect no parameter and return
     * the name of this school
     */
    // write your code here
    public String getName() {
        return name;
    }
}