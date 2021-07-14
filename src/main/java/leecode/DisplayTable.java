package leecode;

import java.util.*;

public class DisplayTable {
    public static void main(String[] args) {
        List<List<String>> lists = Arrays.asList(Arrays.asList("James", "12", "Fried Chicken"), Arrays.asList("Ratesh", "12", "Fried Chicken"), Arrays.asList("Amadeus", "12", "Fried Chicken"), Arrays.asList("Adam", "1", "Canadian Waffles"), Arrays.asList("Brianna", "1", "Canadian Waffles"));
        new DisplayTable().displayTable(lists);
    }

    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> lists = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
        Map<String, Map<String, Integer>> hashMap = new HashMap<>();
        for (List<String> order : orders) {
            String food = order.get(2);
            hashSet.add(food);

        }
        ArrayList<String> list = new ArrayList<>(hashSet);
        Collections.sort(list);
        list.add(0, "Table");

        for (List<String> order : orders) {
            String table = order.get(1);
            String food = order.get(2);
            Map<String, Integer> map = hashMap.getOrDefault(table, new HashMap<>());
            map.put(food, map.getOrDefault(food, 0) + 1);
            hashMap.put(table, map);
        }

        int size = list.size();


        for (Map.Entry<String, Map<String, Integer>> stringMapEntry : hashMap.entrySet()) {
            String table = stringMapEntry.getKey();
            Map<String, Integer> entryValue = stringMapEntry.getValue();
            ArrayList<String> strings = new ArrayList<>();
            strings.add(table);
            for (int i = 1; i < size; i++) {
                String food = list.get(i);
                Integer orDefault = entryValue.getOrDefault(food, 0);
                strings.add(String.valueOf(orDefault));
            }
            lists.add(strings);
        }
        lists.sort(Comparator.comparingInt(o -> Integer.parseInt(o.get(0))));
        lists.add(0, list);
        return lists;
    }
}