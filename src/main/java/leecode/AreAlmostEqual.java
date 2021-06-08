package leecode;

import java.util.ArrayList;
import java.util.List;

public class AreAlmostEqual {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank","kanb"));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                list.add(c1[i]);
                list.add(c2[i]);
            }
        }
        return list.size() == 4 && list.get(0).equals(list.get(3)) && list.get(1).equals(list.get(2));
    }
}