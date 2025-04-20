
class selectionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        selection(arr);

    }
    static void selection(int[] arr) {
        int n = arr.length;
        int max;

        for(int i = 0; i < n; i++) {
            max = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[max]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }

        System.out.print(arr[0]);
    }
}