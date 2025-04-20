import java.util.*;

class kadane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = maxSubSum(arr);
        System.out.print(maxSum);

    }
    static int maxSubSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum > max) {
                max = sum;
            }

            if(sum < 0) {
                sum = 0;
            }

        }
        return max;
    }
}