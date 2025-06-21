class Solution1 {
    String findSum(String s1, String s2) {
        if(s1.length() == 0 || s1 == " " || s1 == null) return s2;
        if(s2.length() == 0 || s2 == " " || s2 == null) return s1;
        
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        char[] temp = new char[Math.max(s1.length(), s2.length()) + 1];
        int carry = 0;
        int index = 0;
        
        while(i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? s1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? s2.charAt(j) - '0' : 0;
            
            int sum = digit1 + digit2 + carry;
            temp[index++] = (char)((sum % 10) + '0');
            carry = sum / 10;
            i--;
            j--;
        }
        
        StringBuilder result = new StringBuilder();
        for(int k = index - 1; k >= 0; k--) {
            result.append(temp[k]);
        }
        int start = 0;
        while (start < result.length() - 1 && result.charAt(start) == '0') {
            start++;
        }

        
        StringBuilder finalResult = new StringBuilder();
        for (int k = start; k < result.length(); k++) {
            finalResult.append(result.charAt(k));
        }

        return finalResult.toString();
        
    }
}