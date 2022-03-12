package day52_map_functionalInterface_LamdaIntro;

public class Test2 {
    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach;
        printEach = s -> {
            for (String each : s.split("")) {
                if (each.equalsIgnoreCase("n")){
                    System.out.print("n");
                    break;
                }
                System.out.print(each + ", ");

            }
        };

        printEach.test("elvin");


    }
}
