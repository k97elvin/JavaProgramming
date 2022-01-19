package day18_NestedLoop;

import java.util.Scanner;

public class odd_Or_Even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a num");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even is " + num);
            } else {
                System.out.println("odd number is" + num);
            }

            System.out.println("Would you like add another num?");
            String a = scan.next();
            if (a.equals("no")) {
    break;
            }
        }
    }
}
