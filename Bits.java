public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        //while (n != 0)
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