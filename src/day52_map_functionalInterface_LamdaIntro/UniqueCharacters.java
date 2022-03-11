package day52_map_functionalInterface_LamdaIntro;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = " aabcccdeeeef";
        String[] arr = str.split("");

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),each);
            if (frequency==1){

                map.put(each,frequency);

            }
        }
        System.out.println(map);


    }


}
