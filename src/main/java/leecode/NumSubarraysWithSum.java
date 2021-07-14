package leecode;

import java.util.HashMap;

public class NumSubarraysWithSum {
    public static void main(String[] args) {
        new NumSubarraysWithSum().numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2);
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        int sum = 0;
        int ret = 0;
        int[] ints = new int[nums.length + 1];
        ints[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            ints[i + 1] = nums[i] + ints[i];
        }
        for (int num : nums) {
            cnt.put(sum, cnt.getOrDefault(sum, 0) + 1);
            sum += num;
            ret += cnt.getOrDefault(sum - goal, 0);
        }
        return ret;
    }
}