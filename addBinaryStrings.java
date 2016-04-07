//my approach

public class Solution {
    public String addBinary(String a, String b) {
    if (a == null || a == "")
        return b;
    if (b == null || b == "")
        return a;
    int carry = 0;
    String res = "";
    int l1 = a.length()-1;
    int l2 = b.length()-1;
    while (l1 >= 0 || l2 >= 0 || carry == 1) 
        {
        if (l1 >= 0)
        {
            carry += Integer.parseInt(a.charAt(l1)+"");
            l1--;
        }
        if (l2 >= 0) 
        {
            carry += Integer.parseInt(b.charAt(l2)+"");
            l2--;
        }
        res = String.valueOf(carry%2) + res;
        carry /= 2;
    }
    return res;
    }
}


//better approach I found online


public class Solution {
    public String addBinary(String a, String b) {
a = (new StringBuilder(a)).reverse().toString();
    b = (new StringBuilder(b)).reverse().toString();
    StringBuilder result = new StringBuilder();
    boolean carry = false;
    for(int i = 0; i < a.length() || i < b.length(); i++) {
        boolean aBit = i < a.length() && a.charAt(i) == '1';
        boolean bBit = i < b.length() && b.charAt(i) == '1';
        if(carry) {
            carry = aBit || bBit;
            result.append((aBit^bBit)?'0':'1');
        } else {
            carry = aBit && bBit;
            result.append((aBit^bBit)?'1':'0');
        }
    }
    result.append(carry?'1':"");
    return result.reverse().toString();

}
}