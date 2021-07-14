package leecode;

public class StrStr {
    public static void main(String[] args) {

    }

    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }
        return haystack.indexOf(needle);
    }

}