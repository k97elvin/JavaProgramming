package day50_Collections;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        //remove all methods thaat are less than 4

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                list.remove(i);

            }
        }
        System.out.println(list);
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        //remove all methods that are less than 4
        Iterator<Integer> iterator = list2.iterator();
        boolean r1 = iterator.hasNext();
        System.out.println(r1);
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println();

        while (iterator.hasNext()) {
            if (iterator.next() < 4) {
                iterator.remove();
            }
        }
        System.out.println(list2);
        System.out.println("_____________________________________________");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        for (Iterator<Integer> i = list3.iterator(); i.hasNext(); ) {
            if (i.next() < 4) {
                i.remove();

            }
        }
        System.out.println(list3);
        Iterator<Integer> iterator1 = list3.iterator();
        System.out.println("iterator1.hasNext() = " + iterator1.hasNext());
        System.out.println("+++++++++++++++++++++++++++++");


        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        list4.removeIf(each -> each < 4);
        System.out.println(list4);


    }
}
