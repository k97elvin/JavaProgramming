package Day15_ForLoop;

import java.util.Arrays;
import java.util.Scanner;

public class SomeOfNumbers {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        //TODO: write your code below

        for (int i = 0, j = 1; i < nums.length; i++, j++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - j];
            nums[nums.length - j] = temp;

        }


        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }

}

