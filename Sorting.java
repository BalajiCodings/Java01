public class Sorting {
    class MergeSort {
    public static void mergeSort(int[] arr, int low, int high) {
        if(low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while(i <= mid && j <= high) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= high)
            temp[k++] = arr[j++];
        
        for(int p = 0; p < temp.length; p++) {
            arr[low + p] = temp[p];
        }
    }
    }


    class BubbleSort {
        public static void bubbleSort(int[] arr, int n) {
            for(int i = 0; i < n - 1; i++) {
                boolean swapped = false;
                for(int j = 0; j < n - i - 1; j++) {
                    if(arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
                if(!swapped) break;
            }
        } 
    }

    class SelectionSort {
        public static void selectionSort(int[] arr, int n) {
            for(int i = 0; i < n - 1; i++) {
                int mini = i;
                for(int j = i + 1; j < n; j++) {
                    if(arr[j] < arr[mini]) {
                        mini = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[mini];
                arr[mini] = temp;
            }
        }
    }

    class InsertionSort {
        public static void insertion_sort(int[] arr, int n) {
            for(int i = 0; i < n; i++) {
                int j = i;
                while(j > i && arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j--;
                }
            }
        }
    }

}


