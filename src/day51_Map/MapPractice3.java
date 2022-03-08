package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 145000);
        map.put("Cory", 145000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);
        map.put("John", 123000);

        int maxSal = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer salary = entry.getValue();
            if (salary > maxSal) {
                maxSal = salary;
            }

        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() != maxSal) {
                continue;
            } else {
                System.out.println("entry.getValue() = " + pair.getKey());
            }
        }


    }
}
