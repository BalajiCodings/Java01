class Patterns {
    public static void main(String[] args) {
        int n = 5;
        /*
        int n = 5;
        System.out.println("*****");
        for(int i = 1; i < n - 1; i++) {
            for(int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println("*****");
        
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < n; i++) {
            for(int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            int val = 1;
            for(int j = 0 ; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }*/


        for(int i = 1; i <= n; i++) {
            for(int s = 0; s <= n - i - 1; s++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n - 1; i >= 0; i--) {
            for(int s = 0; s <= n - i - 1; s++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}