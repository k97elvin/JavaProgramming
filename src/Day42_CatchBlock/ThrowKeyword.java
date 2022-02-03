package Day42_CatchBlock;

import javax.xml.transform.Source;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();

        if (age<0){
           throw new InputMismatchException("age can not be negative");
        }

        if (age>21){
            System.out.println("You are eligible");
        }
    }
}
