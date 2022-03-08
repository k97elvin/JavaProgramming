package day51_Map;

import java.util.*;

public class MapIteration {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();  //
        linkedHashMap.put(2, "Elvin");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Rza");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(40, "Ahmed");

        Set<Integer> keys = linkedHashMap.keySet();
        for (Integer key : keys) {
            //  System.out.println(key + " " + linkedHashMap.get(key));
            linkedHashMap.replace(3, "Elvin" + 5);
        }
        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<String, Integer> students = new HashMap<>();
        students.put("Ali", 70);
        students.put("Elvin", 91);
        students.put("Tom", 54);


        Map<String, Integer> earlyBirds = new HashMap<>();
        Map<String, Integer> angryBirds = new HashMap<>();
        for (String each : students.keySet()) {
            Integer value = students.get(each);
            if (value < 90) {
                angryBirds.put(each, value);
            } else {
                earlyBirds.put(each, value);
            }
        }
        System.out.println(earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


        Collection<Integer> scores = students.values();
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;
        System.out.println("scores = " + scores);
        for (Integer score : students.values()) {
            if (score > maxScore) {
                maxScore = score;
            }
            if (score < minScore) {
                minScore = score;
            }
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("__________________________________");

        int max = Collections.max(students.values());
        System.out.println("Max = " + max);
        System.out.println("__________________________________");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //  System.out.println(entry);
            System.out.println(entry.getKey() + " " + entry.getValue());

        }


    }
}
