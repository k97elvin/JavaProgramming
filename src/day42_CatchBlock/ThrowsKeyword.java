package day42_CatchBlock;

import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        System.out.println("-----------Test1----------");
        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("-----------Test1 completed----------");

        System.out.println("-----------Test2----------");
        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("-----------Test2 completed----------");
    }

}
