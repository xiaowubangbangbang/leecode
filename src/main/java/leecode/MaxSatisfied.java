package leecode;

public class MaxSatisfied {
    public static void main(String[] args) {
        int[] customers = new int[]{1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = new int[]{0, 1, 0, 1, 0, 1, 0, 1};
        int x = 3;
        int i = maxSatisfied(customers, grumpy, x);
        System.out.println(i);
    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int x) {
        int dissatisfied = 0;
        int satisfied = 0;

        int max = 0;
        for (int i = 0; i < customers.length; i++) {
            int customer = customers[i];
            if (grumpy[i] == 1) {
                dissatisfied += customer;
            } else {
                satisfied += customer;
            }
            //滑动窗口
            if (i >= x && grumpy[i - x] == 1) {
                dissatisfied -= customers[i - x];
            }
            max = Math.max(dissatisfied, max);
        }

        return satisfied + max;
    }
}