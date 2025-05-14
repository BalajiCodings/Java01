class Solution {
    public int[] common_digits(int[] nums) {
        // code here
        int n = nums.length;
        boolean[] seen = new boolean[10];
        int count = 0;
        
        
        for(int i = 0; i < n; i++) {
            int num = nums[i];
            while(num > 0) {
                int digit = num % 10;
                if(!seen[digit]) {
                    seen[digit] = true;
                    count++;
                }
                num /= 10;
            }
        }
        //ArrayList<Integer> distInt = new ArrayList<>();
        int[] distInt = new int[count];
        int idx = 0;
        
        for(int i = 0; i < seen.length; i++) {
            if(seen[i]) distInt[idx++] = i;
        }
        
        return distInt;
    }
}