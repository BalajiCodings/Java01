import java.util.*;

class Sol {
    int getCount(String S, int N) {
        if (S == null || S.length() == 0) return 0; // handle empty case
        
        int cnt = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        
        char prev = S.charAt(0);
        hm.put(prev, 1);
        
        for (int i = 1; i < S.length(); i++) {
            char curr = S.charAt(i);
            if (curr != prev) {
                hm.put(curr, hm.getOrDefault(curr, 0) + 1);
                prev = curr;
            }
        }
        
        for (int freq : hm.values()) {
            if (freq == N) cnt++;
        }
        
        return cnt;
    }
}

class Sol1 {
    int getCount(String s, int N) {
        // your code here
        if(s == null || s.length() == 0) return 0;
        
        Map<Character, Integer> occur = new HashMap<>();
        char prev = s.charAt(0);
        occur.put(prev, 1);
        
        for(int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(prev != curr) {
                occur.put(curr, occur.getOrDefault(curr, 0) + 1);
                prev = curr;
            }
        }
        
        int count = 0;
        for(Character c : occur.keySet()) {
            if(occur.get(c) == N) {
                count++;
            }
        }
        return count;
    }
}
