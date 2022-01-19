package Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_practice_3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many numberould you like enter? ");
        int length = scan.nextInt();

        if (length<=0){
            System.err.println("Invalid");
        }
        int []numbers = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a num");
           numbers[i]= scan.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
    }
}
