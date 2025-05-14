class Solution {
    public int findExtra(int a[], int b[]) {
        int n = b.length;
        
        
        for(int i = 0; i < n; i++) {
            if(a[i] != b[i]) {
                return i;
            }
            
        }
        return a.length - 1;
    }
}

class Solution {
    public int findExtra(int a[], int b[]) {
        int n = b.length;
        int left = 0, right = n - 1;
        int index = a.length - 1;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            
            if(a[mid] == b[mid]) {
            
                left = mid + 1;
            }else {
                index = mid;
                right = mid - 1;
                
            }
        }
        return index;
    }
}