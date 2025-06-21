class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < a.length; i++) {
            boolean found = false;
            
            for(int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    found = true;
                    break;
                }
            }
            
            if(!found) {
                list.add(a[i]);
            }
        }
        return list;
    }
}




/*Return elements of b not in a.

Return common elements of a and b.

Find union or intersection in order (with/without duplicates).

Find missing elements when b is a subset of a with one element missing.

Count of unique elements in a not present in b.

import java.util.*;

class Solution {
    public List<Integer> findDifference(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> setB = new HashSet<>();

        // Put all elements of b in set
        for (int val : b) {
            setB.add(val);
        }

        // Check elements of a
        for (int val : a) {
            if (!setB.contains(val)) {
                result.add(val);
            }
        }

        return result;
    }
}


class Solution {
    public int[] findDifference(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        // Simulate a "set" for array b (assume values are in reasonable range)
        int max = 10000; // Adjust based on expected constraints
        boolean[] presentInB = new boolean[max + 1]; // presence map

        for (int i = 0; i < m; i++) {
            if (b[i] >= 0 && b[i] <= max)
                presentInB[b[i]] = true;
        }

        // Result array (at most size of 'a')
        int[] tempResult = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            int val = a[i];
            if (val >= 0 && val <= max && !presentInB[val]) {
                tempResult[index++] = val;
            }
        }

        // Create result array of exact size
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = tempResult[i];
        }

        return result;
    }
}


class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        //ArrayList<Integer> list = new ArrayList<>();
        int n = a.length;
        int m = b.length;
        
        int max = 100000;
        boolean[] presentInB = new boolean[max];
        
        for(int i = 0; i < m; i++) {
            if(b[i] >= 0 && b[i] <= max && !presentInB[b[i]]) {
                presentInB[b[i]] = true;
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(a[i] >= 0 && a[i] <= max && !presentInB[a[i]]) {
                result.add(a[i]);
            }
        }
        
        return result;
    }
}