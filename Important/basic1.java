class basic1 {
    public static void main(String[] args) {

        expandString("a1b10");
    }

    static void expandString(String str) {
        int n = str.length();

        for(int i = 0; i < n;) {
            char ch = str.charAt(i++);
            int num = 0;

            while(i < n && Character.isDigit(str.charAt(i))) {
                num = num * 10 + (str.charAt(i++) - '0');
            }

            for(int j = 0; j < num; j++) {
                System.out.print(ch);

            }
        }
    }
}

/*
public static String encode(String s) {
    if (s == null || s.length() <= 1) {
        return s;
    }
    StringBuilder sb = new StringBuilder();
    int n = s.length();

    for (int i = 0; i < n; i++) {
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (s.charAt(j) == s.charAt(i)) {
                count++;
                i = j;
            } else {
                break;
            }
        }
        sb.append(s.charAt(i)).append(count);
    }
    return sb.toString();
}

class Solution {
    public static String encode(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        
        if(s.length() == 0 || s.length() == 1) {
            return s;
        }
        
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            int count = 1;
            while(i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            
            sb.append(ch).append(count);
            
        }
        return sb.toString();
    }
}
*/
