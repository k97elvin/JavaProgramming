package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();

        students.put("Dene","F");
        students.put("Elvin","M");
        students.put("Rza","M");
        students.put("Ali","F");
        students.put("Toghrul","F");
        students.put("Rasim","M");


   /*     for (String key : students.keySet()) {
            if (students.get(key).equalsIgnoreCase("f")){
                students.replace(key,"Male");
            }
            if(
            students.get(key).equalsIgnoreCase("m")){
                students.replace(key,"Male");
            }
        }
        System.out.println(students);
*/
        System.out.println("____________________________________________");

        for (Map.Entry<String, String> entry : students.entrySet()) {
          if (entry.getValue().equalsIgnoreCase("f")){
              entry.setValue("M");
          }
        }
        System.out.println(students);
        System.out.println("______________________________________________");


        for (Map.Entry<String, String> eachPair : students.entrySet()) {
            String eachKey = eachPair.getKey();
            String eachValue = eachPair.getValue();
            if (eachValue.equalsIgnoreCase("m")){
                System.out.print(eachValue+", ");
            }
        }



    }
}
