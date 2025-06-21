public class FormLar {

    public static String largestNumber(int[] nums) {
        // Convert to strings
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            arr[i] = String.valueOf(nums[i]);

        // Manual sort using compare logic
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                String s1 = arr[i] + arr[j];
                String s2 = arr[j] + arr[i];
                if (s2.compareTo(s1) > 0) {
                    // swap
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        if (arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : arr) sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {10, 2};
        System.out.println(largestNumber(nums)); // "210"
    }
}


/*

class Solution {
    
    // Helper to convert int to string manually
    static String intToStr(int num) {
        if (num == 0) return "0";
        String res = "";
        while (num > 0) {
            char digit = (char) ('0' + (num % 10));
            res = digit + res;
            num /= 10;
        }
        return res;
    }

    // Compare function for sorting
    static boolean isGreater(String a, String b) {
        String ab = a + b;
        String ba = b + a;
        for (int i = 0; i < ab.length(); i++) {
            if (ab.charAt(i) > ba.charAt(i)) return true;
            else if (ab.charAt(i) < ba.charAt(i)) return false;
        }
        return false; // they are equal
    }

    // Bubble sort without inbuilt
    static void customSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (!isGreater(arr[j], arr[j + 1])) {
                    // swap
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static String largestNumber(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];

        // Convert each int to string without using inbuilt
        for (int i = 0; i < n; i++) {
            arr[i] = intToStr(nums[i]);
        }

        // Sort using custom comparator
        customSort(arr);

        // If the largest number is "0", return "0"
        if (arr[0].equals("0")) return "0";

        // Build the final result
        String result = "";
        for (int i = 0; i < n; i++) {
            result += arr[i]; // string concatenation
        }

        return result;
    }

    // Testing
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(nums)); // Output: "9534330"
    }
}

*/