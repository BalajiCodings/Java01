import java.util.*;

class union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};
        int n = union1(arr1, arr2);

        System.out.print(n);

    }
    /*static int unionOfArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[n + m];

        for(int i = 0; i < n; i++) {
            arr3[i] = arr1[i];
        }
        for(int i = 0; i < m; i++) {
            arr3[n + i + 1] = arr2[i];
        }

        return arr3.length;
    }*/

    static int union1(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n + m; i++) {
            if(i < n) {
                set.add(arr1[i]);
            }
            if(i < m) {
                set.add(arr2[i]);
            }
        }
        return set.size();
    }



}

class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        
        HashSet<Integer> s=new HashSet<>();
        int count=0;
        for(int v:a){
            if(s.add(v)){
                count++;
            }
        }
        for(int v:b){
            if(s.add(v)){
                count++;
            }
        }
        return count;
        
    }
}

class Solution1 {
    
    static int findUnion(int[] a, int[] b) {
    Set<Integer> set = new HashSet<>();

    // Add all elements from arr1
    for (int num : a) {
        set.add(num); // O(1) on average
    }

    // Add all elements from arr2
    for (int num : b) {
        set.add(num); // O(1) on average
    }

    return set.size(); // Return the size of the union
}
}