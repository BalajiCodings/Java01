public class EvenOrOdd {
    public static String checkEvenOdd(int num) {
        return (num & 1) == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(4)); // Even
        System.out.println(checkEvenOdd(7)); // Odd
    }
}
