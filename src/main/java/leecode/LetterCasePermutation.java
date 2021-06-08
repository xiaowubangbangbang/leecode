package leecode;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2"));
    }

    public static List<String> letterCasePermutation(String s) {
        int B = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                B++;
            }
        }

        List<String> ans = new ArrayList<>();

        for (int bits = 0; bits < 1 << B; bits++) {
            int b = 0;
            StringBuilder word = new StringBuilder();
            for (char letter : s.toCharArray()) {
                if (Character.isLetter(letter)) {
                    if (((bits >> b++) & 1) == 1) {
                        word.append(Character.toLowerCase(letter));
                    } else {
                        word.append(Character.toUpperCase(letter));
                    }
                } else {
                    word.append(letter);
                }
            }

            ans.add(word.toString());
        }

        return ans;
    }
}