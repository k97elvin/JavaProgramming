package arrays;

import java.util.Scanner;

public class min_NumOf_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = {100, 500, 30, 40, 80, 90};

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];

            }

        }
        System.out.println(min);
    }
}
