public class SingleNumber {
    public static int findSingle(int[] nums) {
        int xor = 0;
        for (int num : nums) xor ^= num;
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 2, 4, 4};
        System.out.println(findSingle(nums)); // 3
    }
}
