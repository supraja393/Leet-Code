public class Solution {
    public int reverse(int x){
  
        int sign = 1;
        long res = 0;

        if(x<0)
        sign = -1;
        
        else if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
        return 0;

        
        x = Math.abs(x);
        
        while (x != 0) 
        {
        res = res * 10 + x%10;
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) 
        {
            return 0;
        }
        x = x / 10;
    }
            return (int)(res*sign);
    }
}

    


