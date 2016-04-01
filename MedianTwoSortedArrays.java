import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i,m = nums1.length;
        int n = nums2.length;
        int nums3[] = new int[m+n];
        int len = m+n;
        for(i = 0;i<m;i++)
    {
        nums3[i] = nums1[i];
    }
    int k = 0;
    for(i = m;i<len;i++)
    {
        nums3[i] = nums2[k];
        k++;
    }
    
    Arrays.sort(nums3);
    
    if(((nums3.length)%2) == 0)
    {
        return (double)(nums3[(len/2)-1] + nums3[(len/2)])/2;
      }
      else
      return nums3[len/2];
    }
}