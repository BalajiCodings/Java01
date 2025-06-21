class Solution {
    static String longestPalindrome(String s) {
        // code here
        int n = s.length();
        int start = 0;
        int maxLen = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(isPalindrome(s, i, j)) {
                    int len = j - i + 1;
                    if(len > maxLen) {
                        maxLen = len;
                        start = i;
                    }
                }
            }
        }
        String res = "";
        for(int i = start; i < start + maxLen; i++) {
            res += s.charAt(i);
        }
        
        return res;
    }
    
    static boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
            
        }
        return true;
        
    }
}


/*
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) {
            // Odd length
            int l1 = expand(s, i, i);
            // Even length
            int l2 = expand(s, i, i + 1);

            int len = Math.max(l1, l2);
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }

        String result = "";
        for (int i = start; i < start + maxLen; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}


Count all palindromic substrings — Count how many palindromes exist in the string.

Longest palindromic subsequence — Not substring. Characters don’t have to be continuous.

Minimum insertions to make a string palindrome — DP-based.

Find all unique palindromic substrings — Store them in a set.

Print all palindromic substrings.
*/