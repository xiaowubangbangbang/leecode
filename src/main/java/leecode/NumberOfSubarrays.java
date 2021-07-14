package leecode;

import java.util.HashMap;

public class NumberOfSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int oddnum = 0;
        for (int num : nums) {
            oddnum += num & 1;
            count += map.getOrDefault(oddnum - k, 0);
            map.put(oddnum, map.getOrDefault(oddnum, 0) + 1);
        }
        return count;
    }
}