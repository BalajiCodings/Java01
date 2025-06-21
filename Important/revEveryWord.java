class Solution1 {
    public String reverseWords(String s) {
        
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int i = 0;
        
        while(i < n) {
            while(i < n && s.charAt(i) == ' ') {
                i++;
            }
            
            if(i >= n) break;
            
            while(i < n && s.charAt(i) != ' ') {
                st.push(s.charAt(i));
                i++;
            }
            
            while(!st.isEmpty()) {
                result.append(st.pop());
            }
            result.append(' ');
        }
        
        if(result.length() > 0) {
            result.setLength(result.length() - 1);
        }
        
        return result.toString();
        
    }
}


public class Solution {

    public static String reverseEachWord(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < n) {
            // Skip leading spaces
            while (i < n && s.charAt(i) == ' ') i++;

            if (i >= n) break;

            // Reverse current word
            StringBuilder word = new StringBuilder();
            while (i < n && s.charAt(i) != ' ') {
                word.insert(0, s.charAt(i));  // reverse while building
                i++;
            }

            // Add word with one space (if not the first)
            if (result.length() > 0) result.append(' ');
            result.append(word);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("  hello   world  "));  // Output: "olleh dlrow"
        System.out.println(reverseEachWord("  a   b "));           // Output: "a b"
        System.out.println(reverseEachWord(""));                   // Output: ""
    }
}
