public class palindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric from left
            while (left < right && !isAlphaNumeric(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric from right
            while (left < right && !isAlphaNumeric(s.charAt(right))) {
                right--;
            }

            char lChar = toLowerCase(s.charAt(left));
            char rChar = toLowerCase(s.charAt(right));

            if (lChar != rChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Check if character is alphanumeric (manually)
    private static boolean isAlphaNumeric(char ch) {
        return (ch >= 'a' && ch <= 'z') || 
               (ch >= 'A' && ch <= 'Z') || 
               (ch >= '0' && ch <= '9');
    }

    // Convert uppercase to lowercase manually
    private static char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        }
        return ch;
    }

    // Test
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input)); // Output: true
    }
}
