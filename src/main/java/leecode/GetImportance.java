package leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

public class GetImportance {
    public int getImportance(List<Employee> employees, int id) {
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashMap<Integer, List<Integer>> listMap = new HashMap<>();
        for (Employee employee : employees) {
            hashMap.put(employee.id, employee.importance);
            if (employee.subordinates.size() > 0) {
                listMap.put(employee.id, employee.subordinates);
            }
        }
        List<Integer> ints = new ArrayList<>();
        allIds(listMap, ints, id);
        count += hashMap.get(id);
        for (Integer w : ints) {
            count += hashMap.get(w);
        }
        return count;
    }

    public void allIds(HashMap<Integer, List<Integer>> listMap, List<Integer> ints, Integer id) {
        List<Integer> ll = listMap.get(id);
        if (ll == null) {
            return;
        }
        for (Integer i : ll) {
            ints.add(i);
            allIds(listMap, ints, i);
        }
    }

}
