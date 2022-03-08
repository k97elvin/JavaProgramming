package day20_Arrays;

import java.util.Arrays;

public class Arrays_Utility {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(nums));
        System.out.println("___________________________________");

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 3, 2};

        Arrays.equals(arr1, arr2);
        boolean r1 = Arrays.equals(arr1, arr2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1, arr2);
        System.out.println(r2);
        System.out.println("_________________________________________");
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        //                0  1  2  3  4  5  6

     /*   for (int i = 0; i < numbers.length; i++) { // i: indexes of the array
            int eachElement = numbers[i];
            System.out.print(eachElement+" ");
        }*/
        System.out.println("---------------------------------");

        for (int each : numbers) { // each: elements of the array
            System.out.println(each);

        }

    }

}