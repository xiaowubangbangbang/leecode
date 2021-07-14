package leecode;

import java.util.Arrays;

public class MaxIceCream {
    public static void main(String[] args) {
        System.out.println(maxIceCream(new int[]{1, 3, 2, 4, 1}, 7));
    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i = 0;
        for (int cost : costs) {
            if (coins >= cost) {
                coins -= cost;
                i = i + 1;
            } else {
                break;
            }
        }
        return i;
    }
}