public class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
   for (int i = 2; i < n; i++) {
      isPrime[i] = true;
   }
   
   for (int i = 2; i * i < n; i++) {
      if (!isPrime[i]) continue;
      for (int j = i * i; j < n; j += i) {
         isPrime[j] = false;
      }
   }
   int count = 0;
   for (int i = 2; i < n; i++) {
      if (isPrime[i]) count++;
   }
   return count;
    }
    
    // a sweet way of solving this problem using BitSets
    public int countPrimes(int n) {
        if(n<=2) return 0;
        
        BitSet checker = new BitSet(n);
        checker.flip(0, n);
        
        int i = 2;
        for(; i <= Math.sqrt(n); i=checker.nextSetBit(i+1)) {
            for(int j=2; i*j < n; j++) {
                checker.set(i*j, false);
            }
        }
        
        return checker.cardinality() - 2;
    }
}
