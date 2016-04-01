public class Solution {
    public boolean isPowerOfTwo(int n) {
            while(n>=2 && n<=Integer.MAX_VALUE)
            {
                if(n%2!=0)
                return false;
                else
                n = n/2;
            }
            if(n==1)
            return true;
            else
            return false;
        
    }
}