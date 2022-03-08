package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Elvin", 100000);
        map.put("Elvin2", 110000);
        map.put("Elvin3", 120000);
        map.put("Elvin4", 130000);
        map.put("Dene", 140000);


        int maxSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String name3 = "";
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();

            if (eachValue > maxSalary) {
                maxSalary = eachValue;
                name3=eachKey;
            }
            System.out.println(name3);

        }
    }
}
