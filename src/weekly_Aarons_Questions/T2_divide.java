package weekly_Aarons_Questions;

import java.util.Scanner;

public class T2_divide {
    public static void main(String[] args) {
        div();
    }

    public static void div() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scan.nextInt();
        System.out.println("Enter second number: ");
        int b = scan.nextInt();

        int i = 0;
        while (a >= b) {
            if (b == 0) {
                System.err.println("invalid");
                break;
            }
            a = a - b;
            i++;
        }
        System.out.println(i);

    }
}
