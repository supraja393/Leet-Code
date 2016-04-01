//Apparently this is one of my best submissions..this is fun!

public class Solution {
    public boolean isHappy(int n) {
        int num = n;
        int res= 0;
        int rem = 0;
        while(num>0)
        {   
            rem = num%10;
            res = res + rem*rem;
            num = num/10;
            
            if(num == 0)
            {
                if(res == 1)
                    return true;
                    
                else if(res == 4)
                return false;
                
                else
                    {
                        num = res;
                        res= 0;
                    }
            }
        }
        return false;
    }
}