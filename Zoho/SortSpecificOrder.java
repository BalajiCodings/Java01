class Solution {
    public int[] customSort(int[] arr) {
        int n = arr.length;

        // Step 1: Separate odd and even
        int[] odds = new int[n];
        int[] evens = new int[n];
        int oddCount = 0, evenCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                odds[oddCount++] = arr[i];
            } else {
                evens[evenCount++] = arr[i];
            }
        }

        // Step 2: Sort odd in descending order (selection sort)
        for (int i = 0; i < oddCount - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < oddCount; j++) {
                if (odds[j] > odds[maxIdx]) {
                    maxIdx = j;
                }
            }
            // Swap
            int temp = odds[i];
            odds[i] = odds[maxIdx];
            odds[maxIdx] = temp;
        }

        // Step 3: Sort even in ascending order (selection sort)
        for (int i = 0; i < evenCount - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < evenCount; j++) {
                if (evens[j] < evens[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap
            int temp = evens[i];
            evens[i] = evens[minIdx];
            evens[minIdx] = temp;
        }

        // Step 4: Combine both parts into result
        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < oddCount; i++) {
            result[index++] = odds[i];
        }
        for (int i = 0; i < evenCount; i++) {
            result[index++] = evens[i];
        }

        return result;
    }
}
