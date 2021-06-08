package leecode;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
        System.out.println(isPalindrome(1233321));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
