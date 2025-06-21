class Solution {
    ArrayList<Integer> findSum(int arr1[], int arr2[]) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        ArrayList<Integer> ls = new ArrayList<>();
        
        while(i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? arr1[i] : 0;
            int digit2 = (j >= 0) ? arr2[j] : 0;
            
            int sum = digit1 + digit2 + carry;
            ls.add(0, (sum % 10));
            carry = sum / 10;
            i--;
            j--;
        }
        return ls;
        
    }
}