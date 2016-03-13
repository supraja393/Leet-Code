public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, j, length = nums.length;
        int[] indices = new int[2];
        
        for(i = 0; i < length; i++) {
            for(j = i + 1; j < length; j++) {
                if(target == (nums[i] + nums[j])) {   
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return null;
    }
}
      
