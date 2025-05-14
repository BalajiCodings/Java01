class GfG {
    /*method prints the given pattern in a single line */
    void printPattern(String s) {
        // Your code here
        int n = s.length();
        int mid = n / 2;
        String S = "";
        
        for(int i = 0; i < n; i++) {
            if(i + mid > n - 1) {
                S = S + s.charAt(i + mid - n);
                System.out.print(S + "$ ");
            }else {
                S = S + s.charAt(i + mid);
                System.out.print(S + "$ ");
            }
        }
    }
}