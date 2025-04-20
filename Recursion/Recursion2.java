//print name n times
//import java.util.*;

public class Recursion2 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 5;
        int sum = 0;
        int fac = factorial(n);
        System.out.println(fac);
    }

    /*static int fun(int i, int n) {
        if(i > n) {
            return i;
        }
        
        return fun(i =i, n);
    }*/

    static int factorial(int n) {
        /*if(n == 0) {
            return sum + 1;
        }*/
        if(n == 0) {
            return 1;
        }

        //int last = factorial(sum, n - 1);
        //int Slast = factorial(sum, n - 2);

        return n * factorial(n - 1);
    }
}

