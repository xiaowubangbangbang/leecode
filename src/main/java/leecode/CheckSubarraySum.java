package leecode;

import java.util.HashMap;

public class CheckSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int key = k == 0 ? sum : sum % k;
            if (hashMap.containsKey(key)) {
                if (i - hashMap.get(key) >= 2) {
                    return true;
                }
                continue;
            }
            hashMap.put(key, i);
        }
        return false;
    }
}