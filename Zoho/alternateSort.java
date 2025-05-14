class Solut {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        ArrayList<Integer> ls = new ArrayList<>();
        int n = arr.length;
        sort(arr);
        
        int start = 0, end = n - 1, idx = 0;
        
        while(start <= end) {
            if(idx < n){
                ls.add(arr[end--]); 
                idx++;
            } 
            if(idx < n) {
                ls.add(arr[start++]);
                idx++;
            }
        }
        
        return ls;
        
    }
    static void sort(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}


import java.util.Arrays;

public class RearrangeArray {

    // Custom sort: Selection Sort
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static int[] rearrange(int[] arr) {
        int n = arr.length;
        sort(arr); // Custom sort

        int[] result = new int[n];
        int start = 0, end = n - 1, idx = 0;

        while (start <= end) {
            if (idx < n) result[idx++] = arr[end--]; // Max
            if (idx < n) result[idx++] = arr[start++]; // Min
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] res = rearrange(arr);
        System.out.println(Arrays.toString(res));
    }
}
