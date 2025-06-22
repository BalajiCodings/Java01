public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 7;
        System.out.println("Before: " + a + ", " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After: " + a + ", " + b);
    }
}
