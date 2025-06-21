class StringProblems {
    public static String remainingString(String s, char ch, int count) {
        int n = s.length();
        int index = -1;

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == ch) {
                count--;
                if(count == 0) {
                    index = i;
                    break;
                }
            }
        }

        if(index == -1 || index + 1 == n) return " ";

        char[] result = new char[n - index - 1];
        for(int i = index + 1; i < n; i++) {
            result[i - index - 1] = s.charAt(i);
        }

        return new String(result);
    }



    public int RomanToInt(String s) {
        int n = s.length();
        int curr = 0,prev = 0;
        int total = 0;

        for(int i = n - 1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I':
                    curr = 1;
                    break;
                case 'V':
                    curr = 5;
                    break;
                case 'X':
                    curr = 10;
                    break;
                case 'L':
                    curr = 50;
                    break;
                case 'C':
                    curr = 100;
                    break;
                case 'D':
                    curr = 500;
                    break;
                case 'M':
                    curr = 1000;
                    break;
            }

            if(curr < prev) total -= curr;
            else total += curr;
        }
        return total;
    }


    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "L", "XL", "C", "XC", "X", "IX", "V", "IV", "I"};
        String res = "";

        for(int i = 0; i < values.length; i++) {
            if(num >= values[i]) {
                num -= values[i];
                res += symbols[i];
            }
        }
        return res;
    }

    class PalindromChecker {
        public static boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;

            while(left < right) {
                while(left < right && !isAlphaNumeric(s.charAt(left))) {
                    left++;
                }

                while(left < right && !isAlphaNumeric(s.charAt(right))) {
                    right--;
                }

                char lChar = toLowerCase(s.charAt(left));
                char rChar = toLowerCase(s.charAt(right));

                if(lChar != rChar) {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }

        public static boolean isAlphaNumeric(char ch) {
            return (ch >= 'A' && ch <= 'Z' 
            || ch >= 'a' && ch <= 'z'
            || ch >= '0' && ch <= '9');
        }

        public static char toLowerCase(char ch) {
            if(ch >= 'A' && ch <= 'Z') {
                return (char) (ch + 32);
            }
            return ch;
        }
    }


    class Anagrams {
        public static boolean isAnagram(String s1, String s2) {
            if(s1.length() != s2.length()) return false;

            int[] count = new int[26];

            for(int i = 0; i < s1.length(); i++) {
                count[s1.charAt(i) - 'a']++;
                count[s2.charAt(i) - 'a']--;
            }

            for(int val : count) {
                if(val != 0) return false;
            }
            
            return true;
        }
    }

    class Pangrams {

    }

    class EncodingDecoding {

    }
}