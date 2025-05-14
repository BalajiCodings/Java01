class Solution {
    public int maxChars(String s) {
        int n = s.length();
        int maxDist = -1;
        
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    int dist = j - i - 1;
                    if (dist > maxDist) {
                        maxDist = dist;
                    }
                    break; // Found farthest matching character for i
                }
            }
        }
        
        return maxDist;
    }
}

class Solution2 {
    public int maxChars(String s) {
        int[] firstIndex = new int[256];
        for(int i = 0; i < firstIndex.length; i++) {
            firstIndex[i] = -1;
        }
        
        int res = -1;
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            int idx = (int) ch;
            if(firstIndex[idx] == -1){
                firstIndex[idx] = i;
            }else {
                res = Math.max(res, i - firstIndex[idx] - 1);
            }
        }
        return res;
    }
}