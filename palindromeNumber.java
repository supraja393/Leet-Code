public class Solution {
    public boolean isPalindrome(int x) {
        int tempa,tempb;
        tempa=x;
        tempb=0;
        while(tempa!=0)
        {
            tempb=tempb*10 + tempa%10;
            tempa=tempa/10;
        }
        if(((tempb - x)==0) && (tempb >= 0))
        return true;
        else
        return false;
    }
}