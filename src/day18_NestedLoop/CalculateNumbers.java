package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class CalculateNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      while(true){  System.out.println("Enter first num:");
        int num1 = scan.nextInt();
        System.out.println("Enter math operator");
        char op1 = scan.next().charAt(0);

        while (!(op1 == '+' || op1 == '-' || op1 == '*' || op1 == '/')) {
            System.err.println("Invalid entry re enter!!!");
            op1 = scan.next().charAt(0);
        }
        System.out.println("Enter second num:");
        int num2 = scan.nextInt();

        int result = (op1 == '+') ? num1 + num2 : (op1 == '-') ? num1 - num2 : (op1 == '*') ? num1 * num2 : num1 / num2;
        System.out.println("result = " + result);

        System.out.println("Do you want continue");
        String answer = scan.next().toLowerCase();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.err.println("Invalid re enter");
            answer = scan.next().toLowerCase();
            if (answer == "no") {

                break;
            }

        }
        System.out.println("Thanks for using Cydeo calculator!");
    }
}}
/*3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */