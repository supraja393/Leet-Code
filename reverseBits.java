public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int power = 31;
        long result = 0;
        while (n != 0 && power >= 0){
            if ((n & 1) == 1){                //if bit is 1, find 2^that power
                result += Math.pow (2,power);
            }
            power--;
            n = n >> 1;  //extrat bits
        }
        return (int)result;
        
    }
}