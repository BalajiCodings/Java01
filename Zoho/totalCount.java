class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int totalParts = 0;
        
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int parts = (num + k - 1) / k;
            totalParts += parts;
        }
        return totalParts;
    }
}

/*
 Variants Asked in Zoho:
Return the split list of numbers instead of just count
e.g., arr = [7, 12], k = 5 → [[5,2],[5,5,2]]

Minimize number of parts for all elements under a fixed total cost constraint

Similar to "Split Array Largest Sum" – advanced binary search on answer
*/