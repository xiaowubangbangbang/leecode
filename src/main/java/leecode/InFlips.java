package leecode;

public class InFlips {
    public static void main(String[] args) {
        int i = minFlips("001011101");
        System.out.println(i);
    }

    public static int minFlips(String target) {
        int count = 0;
        char c = '0';
        for (int i = 0; i < target.toCharArray().length; i++) {
            char c1 = target.charAt(i);
            if (c1 != c) {
                count++;
                c = c1;
            }
        }
        return count;
    }
}