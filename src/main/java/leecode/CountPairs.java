package leecode;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {
    public static void main(String[] args) {
        int[] ints = {57, 57, 514590, 9698, 338289, 710287, 18, 46};

        int i = new CountPairs().countPairs(ints);
        System.out.println(i);
    }

    public int countPairs(int[] deliciousness) {
/*
        int count = 0;

        int n = deliciousness.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                count += (Integer.bitCount(deliciousness[i] + deliciousness[j]) == 1 ? 1 : 0);
            }
        }
        return count % 1000000007;*/
        final int MOD = 1000000007;
        int maxVal = 0;
        for (int val : deliciousness) {
            maxVal = Math.max(maxVal, val);
        }
        int maxSum = maxVal * 2;
        int pairs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int n = deliciousness.length;


        for (int i = 0; i < n; i++) {
            int val = deliciousness[i];
            for (int sum = 1; sum < maxSum; sum <<= 1) {
                Integer orDefault = map.getOrDefault(sum - val, 0);
                pairs = (pairs + orDefault) % MOD;
            }
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        return pairs;
    }
}