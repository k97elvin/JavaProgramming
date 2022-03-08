package arrays;

import java.util.Arrays;

public class Array_Practice {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 50, 70};
        System.out.println(Arrays.toString(numbers));


        System.out.println("____________________________________");

        int[] scores = new int[5];
        scores[1] = 85;
        scores[scores.length - 1] = 95;
        scores[scores.length - 2] = 75;
        scores[0] = 65;
        scores[2] = 55;
        System.out.println(Arrays.toString(scores));

        System.out.println("_____________________________________________");

        String[] month = {"January", "Feb", "March", "April", "May", "June", "July",
                "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < month.length; i++) {
            System.out.print(month[i]+" ");
        }

        System.out.println("_________________________________________");
        for (int i = month.length-1; i >=0 ; i--) {
            System.out.print(month[i] + " ");
        }






    }
}