package leecode;

import java.util.HashMap;

public class MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return 0;
    }
}