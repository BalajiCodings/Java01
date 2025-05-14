class Solution {
    public static void rearrange(int arr[]) {
        // code here
         int n = arr.length;
         sort(arr);

        int maxIdx = n - 1;       // Points to largest element
        int minIdx = 0;           // Points to smallest element
        int maxElem = arr[n - 1] + 1; 
        // Choose a number greater than the max value
        


        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Even index → place max element
                arr[i] = arr[i] + (arr[maxIdx] % maxElem) * maxElem;
                maxIdx--;
            } else {
                // Odd index → place min element
                arr[i] = arr[i] + (arr[minIdx] % maxElem) * maxElem;
                minIdx++;
            }
        }

        // Decode all values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElem;
        }
    }
    
    static void sort(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                    
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            
        }
    }
}
