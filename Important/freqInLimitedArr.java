public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
       
     int n = arr.length;
    List<Integer> l = new ArrayList<>();
        
    
     HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key))
            freq = mp.get(key); // fetching from the map
            freq++;
            mp.put(key, freq); // inserting into the map
        }
    
    
    
     for (int i = 1; i <= n; i++) {
        
        if(mp.get(i)==null)
        {
            l.add(0);
        }
        else
        {
        l.add(mp.get(i));
        }
    }
        
        return l;
    }


public class FrequencyCount {
    public static int[] frequencyCount(int[] arr, int n) {
        // Step 1: Iterate over the array and mark frequencies
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;  // Adjust for 1-based index
            if (arr[index] > 0) {
                arr[index] = -arr[index];  // Mark the index as visited (negate the value)
            }
        }

        // Step 2: Calculate the frequencies
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = Math.abs(arr[i]);  // Frequency of element (1-based index)
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        int n = arr.length;
        int[] result = frequencyCount(arr, n);
        
        // Printing the frequency count
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}


