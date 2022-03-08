package day51_Map;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaa";
//bca
      /*  Map<String, Integer> result = new LinkedHashMap<>();

        String[] arr = str.split("");
        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            result.put(each, frequency);
        }*/
        Map<String, Integer> map = new LinkedHashMap<>();

        String[] arr = str.split("");
        for (String each : arr) {
            int freq = Collections.frequency(Arrays.asList(arr),each);
            map.put(each,freq);
        }
        System.out.println(map);

    }
}
