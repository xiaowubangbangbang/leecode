package leecode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        String n = "";
        //System.out.println(binaryBit(new int[]{1,2,3}));

        System.out.println("2".charAt(0));

    }

    public static List<List<Integer>> binaryBit(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < (1 << nums.length); i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if (((i >> j) & 1) == 1) {
                    sub.add(nums[j]);
                }
            }
            res.add(sub);
        }
        return res;
    }
}