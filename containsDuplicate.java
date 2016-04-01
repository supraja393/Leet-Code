//ah, this is good, I'm becoming better at recognizing which data structure to use where.(not that this is the best approach)

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> abc = new HashSet<Integer>();
        for(int i= 0;i<nums.length;i++)
        {
            if(!abc.add(nums[i]))
            return true;
        }
        return false;
    }
}