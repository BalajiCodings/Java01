class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        if(n == 0 || n == 1) return list;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
            }
        }
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                list.add(arr[i]);
            }
        }
        while(list.size() < n) {
            list.add(0);
        }
        return list;
    }
}
