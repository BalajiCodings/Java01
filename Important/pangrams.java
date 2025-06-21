import java.util.*;

class Solution {
    public static boolean canMakePangram(String str, int k) {
        Set<Character> set = new HashSet<>();
        
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                set.add(Character.toLowerCase(ch)); // store lowercase letters
            }
        }
        
        int missingLetters = 26 - set.size();
        
        // if missing letters can be fixed within k operations
        return missingLetters <= k;
    }
}


class Solution1 {
    boolean kPangram(String str, int k) {
        boolean[] seen = new boolean[26];
        int totalLetters = 0;
        
        for(char ch : str.toCharArray()) {
            if(Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if(!seen[ch - 'a']) seen[ch - 'a'] = true;
                totalLetters++;
            }
        }
        int count = 0;
        for(boolean b : seen) {
            if(b) {
                count++;
            }
        }
        
        int missing = 26 - count;
        
        if(totalLetters < 26) {
            return false;
        }
        
        return missing <= k;
    }
}