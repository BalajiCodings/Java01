import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 16;
        //boolean trueOrFalse = twoSum(arr, target);
        //System.out.print(trueOrFalse);
        int[] ans = twoSum2(arr, target);
        System.out.print(ans[0] + " " + ans[1]);
    }

    static boolean twoSum(int[] arr, int target) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            int sum = arr[i] + arr[i - 1];
            if(sum == target) {
                return true;
            }
        }
        return false;
    }

    static boolean twoSum1(int[] arr, int target) {
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(mpp.containsKey(target - arr[i])) {
                return true;
            }
            mpp.put(arr[i], i);
        }
        return false;
    }

    static int[] twoSum2(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];

        //if(n == 0) return {ans[0] , ans[1]};
        Map<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(mpp.containsKey(target - arr[i])) {
                ans[0] = mpp.get(target - arr[i]);
                ans[1] = i;
                return ans;
            }
            mpp.put(arr[i], i);
        }
        return ans;
    }
}