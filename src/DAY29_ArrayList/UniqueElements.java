package DAY29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7, 8));

        ArrayList<Integer> unique = new ArrayList<>();
        for (int each : list) {
            int frequency = Collections.frequency(list, each);
            if (frequency == 1) {
                unique.add(each);
            }
        }
        System.out.println(unique);

        System.out.println("______________________________________");


    }
}
