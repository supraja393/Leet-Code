public class Solution {
    public int removeElement(int[] nums, int val) {
        
    int a = nums.length-1;
    int b = 0;
    int ctr = 0;
    while(a >= b) {
        if(nums[b] == val) {
            if(nums[a] != val) {
                int temp = nums[a];
                nums[b] = nums[a];
                nums[a] = temp;
                b++;
            }
            a--;
            ctr++;
        } else {
            b++;
        }
    }
    return nums.length-ctr;
        
    }
}