package leecode;

import java.util.HashMap;
import java.util.Map;

public class FindTargetSumWays {
    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }

    public static int findTargetSumWays(int[] nums, int t) {
        return dfs(nums, t, 0, 0);
    }

    static Map<String, Integer> cache = new HashMap<>();

    static int dfs(int[] nums, int t, int u, int cur) {
        String key = u + "_" + cur;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        if (u == nums.length) {
            cache.put(key, cur == t ? 1 : 0);
            return cache.get(key);
        }
        int left = dfs(nums, t, u + 1, cur + nums[u]);
        int right = dfs(nums, t, u + 1, cur - nums[u]);
        cache.put(key, left + right);
        return cache.get(key);
    }

}