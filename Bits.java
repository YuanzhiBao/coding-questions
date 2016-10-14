public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        //while (n != 0)
        //when we implement 2^31 = 2147483648 
        //it is 2147483647 + 1
        //which is 01111111 11111111 11111111 11111111 + 00000000 00000000 00000000 00000001
        //it become 10000000 00000000 00000000 00000000 in the system.
        //which is -2147483648, as we right shift this number, it add 1 to the top.
        //so it will become 11000000 00000000 00000000 00000000 for the first move
        //11100000 00000000 00000000 00000000 for the second move
        //And keep going like this way
        //for loop is right,  but when you use while loop it become funny.
        for (int i = 0; i < 32; i++ )
        {
           System.out.println(count);
                if ((n & 1) == 1) {
                    count++;
                }
            n = n >> 1;
        }
        return count;
    }
}