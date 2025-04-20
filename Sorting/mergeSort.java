import java.util.*;

class mergeSort {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        printArray(arr, n);

    }
    public static void merge(int[] arr, int start, int mid, int end) {
        List<Integer> ls = new ArrayList<>();
        int left = start, right = mid + 1;
        while(left <= mid && right <= end) {
            if(arr[left] <= arr[right]) {
                ls.add(arr[left]);
                left++;
            }else {
                ls.add(arr[right]);
                right++;
            }
        }

        while(left <= mid) {
            ls.add(arr[left]);
            left++;

        }
        while(right <= end) {
            ls.add(arr[right]);
            right++;
        }

        for(int i = start; i <= end; i++) {
            arr[i] = ls.get(i - start);
        }
        
    }
    public static void mergeSort(int[] arr, int start, int end) {
        if(start >= end) return;
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
        
    }
    public static void printArray(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}