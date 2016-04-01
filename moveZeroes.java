public class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int i = 0;
        int pos;
        while(i<len){
            if(nums[i]==0) 
                break;                   //get the first zero location
            i++;
        }
        pos=i;
        while(i<len){
            if(nums[i]!=0){
                nums[pos++]=nums[i];          
                nums[i]=0;
            }
            i++;
        }
    }
    }
