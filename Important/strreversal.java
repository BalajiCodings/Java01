class Solution {
    public String reverse(String str) {

        //char[] arr = str.toCharArray();
        int n = str.length();
        char[] arr = new char[n];
        for(int i = 0; i < n; i++) {
            arr[i] = str.charAt(i);
        }
        
        int l = 0, r = arr.length - 1;
        
        while(l < r) {
            if(!Character.isAlphabetic(arr[l])) {
                l++;
            }else if(!Character.isAlphabetic(arr[r])) {
                r--;
            }else {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        /*StringBuilder sb = new StringBuilder();
        for(char c : arr) {
            sb.append(c);
        }*/
        return new String(arr);
    }
}

class Solution1 {
    public String reverse(String str) {
        char[] arr = str.toCharArray(); // now allowed
        
        int l = 0, r = arr.length - 1;
        
        while (l < r) {
            if (!Character.isAlphabetic(arr[l])) l++;
            else if (!Character.isAlphabetic(arr[r])) r--;
            else {
                char temp = arr[l];
                arr[l++] = arr[r];
                arr[r--] = temp;
            }
        }
        
        return new String(arr); // directly use array to String
    }
}


class Solution2 {
    public String reverse(String str) {
        StringBuilder letters = new StringBuilder();
        
        // 1. Collect all alphabetic characters
        for (char ch : str.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                letters.append(ch);
            }
        }
        
        // 2. Now reverse the collected letters
        letters.reverse();
        
        StringBuilder result = new StringBuilder();
        int letterIndex = 0;
        
        // 3. Rebuild the string
        for (char ch : str.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                result.append(letters.charAt(letterIndex++)); // pick next reversed letter
            } else {
                result.append(ch); // keep special character as it is
            }
        }
        
        return result.toString();
    }
}


class Solution4 {
    public String reverse(String str) {
        if (str == null || str.length() == 0) {
            return str; // Handle null or empty string safely
        }
        
        StringBuilder letters = new StringBuilder();
        
        // Step 1: Collect all alphabetic characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                letters.append(ch);
            }
        }
        
        letters.reverse(); // Step 2: Reverse the collected letters
        
        StringBuilder result = new StringBuilder();
        int letterIndex = 0;
        
        // Step 3: Rebuild the result string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                result.append(letters.charAt(letterIndex++));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}
