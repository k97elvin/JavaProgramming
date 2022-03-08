package day50_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "Civic", "Radar", "kayak", "reviver", "madam"));

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String each = it.next();
            String revert = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                revert += each.charAt(i);

            } if (each.equalsIgnoreCase(revert)) {
                it.remove();
            }

            System.out.println(names);

        }

    }
}
