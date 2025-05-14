class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int n = s.length();

        for(int shift = 0; shift < s.length(); shift++) {
            char ch = s.charAt(shift);
            boolean match = true;

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt((i + shift) % n) != (goal.charAt(i))) {
                    match = false;
                    break;
                }
            }
            if(match) return true;
        }
        return false;

    }
}