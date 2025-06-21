class Gfg1 {
   
    static void reverses(String str)
    {

        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];

        // Mark spaces in result
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Traverse input string from beginning
        // and put characters in result from end
        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {

            // Ignore spaces in input string
            if (inputArray[i] != ' ') {

                // ignore spaces in result.
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));
    }

    public static void main(String[] args)
    {
        String s = "internship at geeks for geeks";
        reverses(s);
    }
}
class Solution1 {
    String reverseWithSpacesIntact(String S) {
        // your code here
        char[] str = S.toCharArray();
        int left = 0, right = str.length - 1;
        
        while(left < right) {
            if(str[left] == ' ') {
                left++;
                continue;
            }else if(str[right] == ' ') {
                right--;
                continue;
            }else {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }
        
        return String.valueOf(str);
    }
}
