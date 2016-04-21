class MergeSort {
    public static void merge(int [] arr,int left, int mid, int right) {
        int [] temp = new int[25];
        int i, leftend, total, tmp;
    
        leftend = (mid - 1);
        tmp = left;
        total = (right - left + 1);
    
        while ((left <= leftend) && (mid <= right))
            temp[tmp++] = (arr[left] <= arr[mid]) ? arr[left++] : arr[mid++];
    
        while (left <= leftend)
            temp[tmp++] = arr[left++];
 
        while (mid <= right)
            temp[tmp++] = arr[mid++];
 
        for (i = 0; i < total; i++) {
            arr[right] = temp[right];
            right--;
        }
    }
 
    public static void recursivemerge(int [] arr,int left, int right) {
      int mid;
    
      if (right > left) {
        mid = (right + left) / 2;
        recursivemerge(arr, left, mid);
        recursivemerge(arr, (mid + 1), right);
    
        merge(arr, left, (mid+1), right);
      }
    }
 
    public static void main(String[] args) {
        int[] arr= { 20,11,32,5,1,3,7,99,43,8};
        int len = 10; 
        recursivemerge(arr, 0, len - 1);
        for (int i = 0; i < 10; i++)
            System.out.println(arr[i]);
    }
}
