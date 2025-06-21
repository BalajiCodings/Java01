// Java program to reverse order of vowels
// in a string using Two Pointers method
import java.util.*;

class GfG1 {
    
    // Function to check if a character is a vowel
    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' 
               || c == 'o' || c == 'u';
    }

    static String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int left = 0, right = str.length - 1;
        
        // Two-pointer approach to swap vowels
        while (left < right) {
            
            // Move left pointer until a vowel is found
            while (left < right && !isVowel(str[left])) {
                left++;
            }

            // Move right pointer until a vowel is found
            while (left < right && !isVowel(str[right])) {
                right--;
            }

            // Swap the vowels
            if (left < right) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(str);
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(reverseVowels(s));
    }
}


// Java program to reverse order of vowels
// in a string using BruteForce method


class GfG {

    // Function to check if a character is a vowel
    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' 
               || c == 'o' || c == 'u';
    }

    static String reverseVowels(String s) {
        StringBuilder vowelStr = new StringBuilder();
        
        // Store all vowels in vowelStr
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowelStr.append(s.charAt(i));
            }
        }

        // Reverse read vowels and replace in string
        StringBuilder result = new StringBuilder(s);
        int idx = vowelStr.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                result.setCharAt(i, vowelStr.charAt(idx--));
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(reverseVowels(s));
    }
}

