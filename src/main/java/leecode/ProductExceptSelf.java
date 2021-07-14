package leecode;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ints = new int[nums.length];
        ints[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ints[i] = nums[i - 1] * ints[i - 1];
        }
        int r = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ints[i] = ints[i] * r;
            r *= nums[i];
        }
        return ints;
    }
}