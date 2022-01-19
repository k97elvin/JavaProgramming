package Day20_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers would yo like to add:");
        int vOfNumbers = scan.nextInt();
       /* int []numbers = new int[vOfNumbers];
        int max = 0;
        for (int i = 0; i < vOfNumbers; i++) {
            System.out.println("Enter number");
          numbers[i] = scan.nextInt();
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("max number is "+ max);*/
     /*   int[] numbers = new int[vOfNumbers];
        int max = 0;
        for (int i = 0; i < vOfNumbers; i++) {
            System.out.println("Enter number ");
            numbers[i] = scan.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
            }
            System.out.println("max = " + max);
        }*/
        int[] num =new int[vOfNumbers];
        int max = 0;
        for (int i = 0; i < vOfNumbers; i++) {
            System.out.println("Enter num");
        if (num[i]>0){
            max = num[i];

        }
        }
        System.out.println("max = " + max);
    }
}
