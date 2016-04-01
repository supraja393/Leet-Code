//this is not my approach,but it's such a cute code, hence adding-

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}

//these are my approaches

//I discovered a new function. very handy.
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String res = Integer.toBinaryString(n);   //said new function
        int count = 0;
        for(int i = 0; i<res.length(); i++)
        {
            if(res.charAt(i) == '1')
            count++;
        }
        return count;
    }
}



//this approach gives me wrong answer for input   2147483648 (10000000000000000000000000000000)

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        if(n<=0)
        return 0;
        
        StringBuilder sb = new StringBuilder();
        int r=0;
        while(n>0)
        {
            r = n%2;
            n = n/2;
            sb.append(r);
        }
        int len = sb.length();

        if(len<32)
        {
            for(int i=0;i<(32-len);i++)
            sb.append("0");
        }
        sb.reverse();
        int count= 0;
        for(int i =0;i<32;i++)
        {
            if(sb.charAt(i) == '1')
            count++;
        }
        return count;
    }
}

//This gives me the wrong answer for input 1
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        if(n<=0)
        return 0;
        
        StringBuilder sb = new StringBuilder();
        int r=0;
        while(n>0)
        {
            r = n%2;
            n = n/2;
            sb.append(r);
        }
        int len = sb.length();

        if(len<32)
        {
            for(int i=0;i<(32-len);i++)
            sb.append("0");
        }
        sb.reverse();
        int count= 0;
        for(int i =0;i<32;i++)
        {
            if(sb.charAt(i) == '0')
            count++;
        }
        return count;
    }
}