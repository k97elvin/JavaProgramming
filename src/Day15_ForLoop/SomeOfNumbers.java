package Day15_ForLoop;

import java.util.Scanner;

public class SomeOfNumbers {
    public static void main(String[] args) {
        double sum= 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("________________________________");

        String total = "0" ;
        Scanner scan =new Scanner(System.in);

        System.out.println("enter a number: ");
       total += scan.next();

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number: ");
            total += scan.next();
        }
        System.out.println(total);
scan.close();








        }
    }

