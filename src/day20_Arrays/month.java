package day20_Arrays;

import java.util.Arrays;

public class month {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);

        }
        System.out.println("____________________________");
        int[] numbers = {10, 9, 0, 1, 2, 20, 4, 6, 7, 8};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
