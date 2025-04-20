

class recursion3 {
    public static void main(String[] args) {
        int result = fibonacci(0, 5); // Example call to factorial
        System.out.println("Factorial result: " + result);
    }
    static int fibonacci(int sum, int n) {
    if(n == 0) {
        return sum + 1;
    
    }
    if(n == 1) {
        return sum + 1;
    }

    int last = fibonacci(sum, n - 1);
    int Slast = fibonacci(sum, n - 2);

    return last + Slast;
    }
}