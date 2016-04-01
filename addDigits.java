//my approach

public class Solution {
    public int addDigits(int num) {
        int total = 0;
        if(num < 10)
        return num;
        
        while(num>0)
        {
            total += (num%10);
            num/=10;
            
            if(num==0)
            {
                if(total<10)
                return total;
                
                else
                num = total;
                total = 0;
                
            }
            
        }
 return -1;
    }
}


//A solution I found much later.This is such a beautiful solution :O I should learn..

public class Solution {
    public int addDigits(int num) {
        return num!=0 ? (num%9!=0?num%9:9) : 0;
    }
}