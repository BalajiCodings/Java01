class Solution {
    static String removeChars(String str1, String str2) {
        
        if(str1 == null || str2 == null) return str1;
        
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26]; 
        
        for(int i = 0; i < str2.length(); i++) {
            arr[str2.charAt(i) - 'a'] = 1; 
        }
        
        for(int i = 0; i < str1.length(); i++) {
            if(arr[str1.charAt(i) - 'a'] != 1) {
                sb.append(str1.charAt(i));
            }
        }
        
        return sb.toString();
        
    }
}


//import java.util.*;

class GFG {
    static String removeChars(String s1, String s2) {
        if (s1 == null || s2 == null) return s1; // handle null safely
        
        StringBuilder result = new StringBuilder();
        
        // Use a HashSet to store characters to be removed
        Set<Character> removeSet = new HashSet<>();
        
        for (char c : s2.toCharArray()) {
            if (Character.isLetter(c)) { // only consider alphabetic characters
                removeSet.add(Character.toLowerCase(c));
            }
        }
        
        for (char c : s1.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!removeSet.contains(Character.toLowerCase(c))) {
                    result.append(c);
                }
            } else {
                // If not an alphabetic character (space, symbol), keep it as it is
                result.append(c);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String string1 = "GeeksForGEEks!!!";
        String string2 = "mask";

        System.out.println(removeChars(string1, string2)); 
        // Expected output: "GeeksForGEEks!!!" -> Remove m, a, s, k from it safely
    }
}
