package day49_Collections;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        String[] arr = {"Woode", "Book", "Shelf", "Pen", "Book", "Shelf",};
        Set<String> set1 = new HashSet<>(Arrays.asList(arr));

        System.out.println(set1);

//        arr=set1.toArray(new String[1]);
//        System.out.println(Arrays.toString(arr));
        new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);

        System.out.println("______________________________________");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 12, 45, 67, 3532, 567, 132, 12, 45, 67));

        System.out.println(list);

//        String str1 = "aaaabbbbbcccccddddeeeee";
//        String res = "";
//
////        char[] chars ={};
////        for (int i = 0; i < str1.length(); i++) {
////            char c = str1.charAt(i);
////            chars.
////        }
        System.out.println("__________________");

        Integer[] nums = {1, 2, 3, 4, 5, 2, 34, 5, 532, 12, 34, 2, 3, 4, 1, 4};

        nums = new HashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));

        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(nums));
        System.out.println(set2);

        Set<Integer> set3 = new TreeSet<>(Arrays.asList(nums));
        System.out.println(set3);

        System.out.println("________________________");

        String[] strings = {"Mariam", "Elvin", "Elvin", "Rza", "Mariam"};

        Set<String> setStrings = new HashSet<>(Arrays.asList(strings));
        System.out.println(setStrings);
        System.out.println("______________________________");


        String str5 = "aaaabbbbbcccccc";
        //     String[] arr5 = str5.split("");
        //   System.out.println(Arrays.toString(arr5));
        String result = "";
        for (String each : new LinkedHashSet<>(Arrays.asList(str5.split("")))) {
            int count = Collections.frequency(Arrays.asList(str5.split("")), each);
            result += each + count;
        }
        System.out.println(result);
    }
}








