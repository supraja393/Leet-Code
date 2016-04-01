//this is not a good approach..:( I should practise more

public class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n>Integer.MAX_VALUE || (n == 0))
        return false;
        
        else
        {

        while(n>=3)
            {
                if(n%3!=0)
                return false;
                else
                n = n/3;
            }
            if(n==1)
            return true;
            else
            return false;
}
}
}



//I discovered this on LeetCode Discuss. This is such an amazing solution.

public class Solution {
    public boolean isPowerOfThree(int n) {
        
         return ( n>0  &&  1162261467%n==0);     //1162261467 is the highest power of 3, less than Integer.MAX_VALUE
}
}
