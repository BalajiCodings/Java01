import java.util.*;

class permutation {
    public static void main(String[] args) {
        permutation p = new permutation();
        String s = "aab";
        System.out.print(p.uniquePermutations(s));
    }
    public List<String> uniquePermutations(String s) {
        List<String> result = new ArrayList<>();
        char[] arr = s.toCharArray();

        // Sort the character array manually using selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap characters at i and minIdx
            char temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        boolean[] used = new boolean[arr.length];
        backtrack(arr, used, "", result);
        return result;
    }

    private void backtrack(char[] arr, boolean[] used, String current, List<String> result) {
        // Base case: when current string is of same length as input
        if (current.length() == arr.length) {
            result.add(current);
            return;
        }

        char prev = '\0';  // track previous character at this level to skip duplicates
        for (int i = 0; i < arr.length; i++) {
            if (used[i]) continue;            // skip if character already used
            if (arr[i] == prev) continue;     // skip duplicate at the same recursion level

            used[i] = true;
            backtrack(arr, used, current + arr[i], result);  // choose this char
            used[i] = false;                                // backtrack
            prev = arr[i];                                  // set prev to current char
        }
    }
}
