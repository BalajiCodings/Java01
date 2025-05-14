class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n];
        
        for(int num : arr) {
            if(num >= 1 && num <= n) {
                freq[num - 1]++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int count : freq) {
            list.add(count);
        }
        return list;
    }
}

class Solution {
    public int[] frequencyCount(int[] arr) {
        int n = arr.length;

        // Step 1: Decrease all values by 1 so index matches value
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] - 1;
        }

        // Step 2: Use elements as index and increase count
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;  // get original value before mod
            if (index >= 0 && index < n) {
                arr[index] += n;     // increment by n to encode frequency
            }
        }

        // Step 3: Finalize the result: frequency = value / n
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }

        return arr;
    }
}




