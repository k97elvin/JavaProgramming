package day50_Collections;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 6, 7));
        System.out.println("set.size() = " + set.size());

        List<Integer> list = new ArrayList<>(set);


        //    List<String> names = null;
        //   System.out.println(names.size());
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Elvin", "ahmad", "Rza", "Nadir", "Elvin"));
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase("Elvin")) {
                it.remove();

            }
        }
        System.out.println(names);

        System.out.println("____________________________________");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Elvin", "ahmad", "Rza", "Nadir", "Elvin"));

//        names2.removeIf(each-> each.equalsIgnoreCase("rza"));
//        System.out.println("names2 = " + names2);

        Iterator<String> it2 = names2.iterator();
        while(it2.hasNext()){
            if (it2.next().equalsIgnoreCase("rza")){
                it2.remove();
            }
        }
        System.out.println(names2);

    }

}
