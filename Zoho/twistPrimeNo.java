class twistPrimeNo {
    int isTwistedPrime(int N) {
        // code here
        int reversed = rev(N);
        if(isPrime(reversed) && isPrime(N)) {
            return 1;
        }
        return 0;
        
    }
    boolean isPrime(int num) {
        if(num <= 1) return false;
        
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false; 
        }
        return true;
    }
    int rev(int n) {
        if(n >= 0 && n <= 9) return n; 
        int reversed = 0;
        while(n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}