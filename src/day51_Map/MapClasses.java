package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
//           key          Value
        Map<Integer, String> hashMap = new HashMap<>();        //fastest but random order
        hashMap.put(2, "Elvin");
        hashMap.put(20, "George");
        hashMap.put(3, "Rza");
        hashMap.put(40, "Emma");
        hashMap.put(40, "Ahmed"); //key cannot duplicate. If they duplicated it will accept last added one.
        hashMap.put(null, null);  //it accepts only one null keyword for key. But for the value we can give as many as.

        System.out.println("linkedHasMap = " + hashMap);
        System.out.println("______________________________________________");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();  //
        linkedHashMap.put(2, "Elvin");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Rza");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(40, "Ahmed");
        System.out.println("linkedHasMap = " + linkedHashMap);


        Map<Integer, String> map3 = new TreeMap<>();        //



        Map<Integer, String> map4 = new Hashtable<>();      //


    }
}
