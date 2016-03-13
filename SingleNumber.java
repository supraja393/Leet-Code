//using bit manipulation
public class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
	for (int a : nums) {
		x = x ^ a;
	}
	return x;
    }
}


//using HashSet

public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> abc = new HashSet<Integer> ();
        for(int n : nums)
        {
            if(!(abc.add(n)))   
            abc.remove(n);
        }
        Iterator<Integer> yo = abc.iterator();
        return yo.next();
    }
}