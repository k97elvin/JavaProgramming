package Day20_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers would you like add:");
        int say = scan.nextInt();

        int[] numbers = new int[say];
        int sum = 0;
        for (int i = 0; i < say; i++) {
            System.out.println("Enter your number :");
            int each = scan.nextInt();
           sum+=each;
        }
        int averageNumber = sum/numbers.length;
        System.out.println(averageNumber);
    }
}
