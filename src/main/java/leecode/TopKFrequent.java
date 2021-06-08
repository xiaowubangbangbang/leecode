package leecode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TopKFrequent {
    public static void main(String[] args) {
        String[] strings = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(topKFrequent(strings, 2));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> word))//本身分组
                .entrySet().stream()
                .sorted((s1, s2) -> s1.getValue().size() == s2.getValue().size() ? s1.getKey().compareTo(s2.getKey()) : s2.getValue().size() - s1.getValue().size())//排序
                .map(stringIntegerEntry -> stringIntegerEntry.getKey())//取key
                .limit(k)//截取
                .collect(Collectors.toList());
    }
}