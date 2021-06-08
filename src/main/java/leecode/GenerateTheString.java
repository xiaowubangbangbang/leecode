package leecode;

public class GenerateTheString {
    public static void main(String[] args) {

    }

    public static String generateTheString(int n) {
        char[] chars = new char[n];
        for (int i = 0; i < n - 1; i++) {
            chars[i] = 'a';
        }
        chars[n - 1] = (n & 1) == 0 ? 'b' : 'a';

        return new String(chars);
    }
}