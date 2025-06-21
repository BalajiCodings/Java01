import java.util.*;

class arrDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i< n; i++) {
            arr[i] =sc.nextInt();
        }

        arrDuplicates obj = new arrDuplicates();
        //obj.findDuplicates(arr);
        System.out.print(obj.findDuplicates(arr));
    }
    /*List<Integer> findDuplicates(int[] arr) {
        int left = 0;
        int right = 0;
        List<Integer> ls = new ArrayList<>();

        while(left < arr.length || right < arr.length){
            right = left + 1;

            if(arr[left] == arr[right]) {
                ls.add(arr[left]);
                left++;
                break;
            }

            left++;
            right++;
        }
    }*/

    List<Integer> findDuplicates(int[] arr) {
        List<Integer> ls = new ArrayList<>();
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    ls.add(arr[i]);
                }
            }
        }

        return ls;
    }
}