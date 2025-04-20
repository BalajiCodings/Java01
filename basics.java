import java.util.*;

public class basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //bala ne = new bala();
        //ne.squareNo(n);

        //System.out.println(n);
        int n = 45;

        //basics countDigits = new basics();

        //int bala = countDigits.countDigits(n);
        //System.out.println(bala);

        //int val = reverse(n);
        Palindrome p = new Palindrome();
        //boolean pres = p.checkPalindrome(n);

        

        //System.out.println(p.checkPalindrome(n));

        List<Integer> ans = Divisors.findDivisors(n);

        System.out.println(ans);

    }

    public static int reverse(int n) {
        //int dup = n;
        int sum = 0;

        if(n >= 0 && n <=9) {
            return n;
        }

        while(n > 0) {
            int ld = n % 10;
            sum = (sum * 10) + ld;
            n = n / 10;
        }

        return sum;
    }

    /*public static void squareNo(int n) {
        long p = n * n;

        System.out.println(p);
    }

    public int countDigits(int n) {
        int count = 0;

        while(n > 0) {
           
            count ++;

            n = n / 10;

        }

        return count;
    }*/


}

class bala {
    public void squareNo(int n) {
        long p = n * n;

        System.out.println(p);
    }

}

class Palindrome {
    public static boolean checkPalindrome(int n) {
        
        int dup = n;
        int rev = 0;

        while(n > 0) {
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n = n / 10;
        }

        if(dup == rev) {
            return true;
        }else {
            return false;
        }


    }
}

class Divisors {
    public static List<Integer> findDivisors(int n) {
        int sqrt = (int) Math.sqrt(n);

        List<Integer> div = new ArrayList<>();

        if(n == 0) {
            return null;
        }
        if( n == 1) {
            //return new ArrayList<>(Arrays.asList(1));
            div.add(1);
            return div;
        }


        for(int i = 1; i < sqrt; i++) {
            if(n % i == 0) {
                div.add(i);
            }

            if(n / i != i) {
                div.add(n / i);
            }
        }

        return div;
    }
}