class Solution1 {
    static String crossPattern(String S) {
        // code here
        int n = S.length();
        char[][] arr = new char[n][n];
        
        for(int i = 0; i < n; i++) {
            Arrays.fill(arr[i], ' ');
        }
        
        for(int i = 0; i < n; i++) {
            arr[i][i] = S.charAt(i);
            arr[i][n - i - 1] = S.charAt(i);
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(new String(arr[i])).append("\n");
        }
        return result.toString();
    }
}


class Solution {
    static String crossPattern(String S) {
        int n = S.length();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    sb.append(S.charAt(j));
                }else if(j == n - i - 1) {
                    sb.append(S.charAt(j));
                }else{
                    sb.append(' ');
                }
            }   
        }
        return sb.toString();
    }
}



// Java program to print the given pattern 
import java.io.*; 
class GFG { 

	// Function to print the given 
	// string in respective pattern 
	static void printPattern(String str, int len) 
	{ 
		for (int i = 0; i < len; i++) { 
			for (int j = 0; j < len; j++) { 

				// Print characters at corresponding 
				// places satisfying the two conditions 
				if ((i == j) || (i + j == len - 1)) 
					System.out.print(str.charAt(j)); 

				// Print blank space at rest of places 
				else
					System.out.print(" "); 
			} 

			System.out.println(); 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String str = "geeksforgeeks"; 
		int len = str.length(); 
		printPattern(str, len); 
	} 
} 

// This code is contributed by rag2127.

