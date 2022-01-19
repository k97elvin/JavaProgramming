package Day17_While_Loop;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

        System.out.println("Enter first num:");
        int num1 = scan.nextInt();

        System.out.println("Enter 2nd num:");
        int num2 = scan.nextInt();

        System.out.println("Enter math operator");
        char ch = scan.next().charAt(0);

        if (!(ch=='+'||ch=='-')){
            System.out.println("Invalid op, re-enter");
            ch = scan.next().charAt(0);

        }

        System.out.println((ch =='+')? num1+num2 : num1-num2);

    }
}
