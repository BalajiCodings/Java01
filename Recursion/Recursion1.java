
public class Recursion1 {
    public static void main(String[] args) {
         int n = 1;
        int v = recursion1(n);

        System.out.println(v);

    }

    static int recursion1(int n) {
        if(n == 5) {
            return n;
        }
        recursion1(n + 1);

        return n;

    }

}