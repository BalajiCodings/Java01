class Solution {
    static String isSumOfTwo(int N) {
        // code here
        if(N <= 1) return "No";
        for(int i = 2; i <= N/2; i++) {
            if(isPrime(i) && isPrime(N - i)) {
                return "Yes";
            }
        }
        return "No";
        
    }
    
    static boolean isPrime(int n) {
        if(n <= 1) return false;
        
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}