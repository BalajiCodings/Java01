class Solution {
    boolean isSubSequence(String A, String B) {
        int n = A.length();
        int m = B.length();
        int i = 0, j = 0;
        
        if(n == 0) return true;
        if(m == 0) return false;
        while(i < n && j < m) {
            if(A.charAt(i) == B.charAt(j)) {
                i++;
            }
            j++;
        }
        
        return i == n;
    }
}


class SubSequence {
    // Returns true if s1[] is a subsequence of s2[]
    // m is length of s1 and n is length of s2
    static boolean isSubSequence(String s1, String s2,
                                 int m, int n)
    {
        // Base Cases
        if (m == 0)
            return true;
        if (n == 0)
            return false;

        // If last characters of two strings are matching
        if (s1.charAt(m - 1) == s2.charAt(n - 1))
            return isSubSequence(s1, s2, m - 1, n - 1);

        // If last characters are not matching
        return isSubSequence(s1, s2, m, n - 1);
    }

    // Driver program
    public static void main(String[] args)
    {
        String s1 = "gksrek";
        String s2 = "geeksforgeeks";
        int m = s1.length();
        int n = s2.length();
        boolean res = isSubSequence(s1, s2, m, n);
        if (res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}