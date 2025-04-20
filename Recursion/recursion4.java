
class recursion4 {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        //byCollections(arr);
        //swapToReverse(arr);

        reverseArr(arr, 0, arr.length - 1);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    /*static void byCollections(int[] arr) {
        //Collections.sort(Arrays.asList(arr));
        Arrays.sort(arr);

        System.out.println(arr[0] + " ");

    }*/

    /*static void swapToReverse(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }*/

   // recursive method

    static void reverseArr(int[] arr, int start, int end) {
        if(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArr(arr, start + 1, end - 1);
        }
    }



}