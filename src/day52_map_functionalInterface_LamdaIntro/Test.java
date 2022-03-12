package day52_map_functionalInterface_LamdaIntro;

public class Test {
    public static void main(String[] args) {
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n % 2 == 0) {
                System.out.println("even");
            } else System.out.println("odd");

        };
        oddOrEvenNumber.apply(20);


        MyFirstFunctionalInterface eligibleAlcohol = (age) -> {
            if (age >= 21) {
                System.out.println("eligible to buy alcohol");
            } else System.out.println("not eligible to buy alcohol");
        };
        eligibleAlcohol.apply(70);


        MyFirstFunctionalInterface printCube = (n) -> {
            System.out.println(n * n * n);
        };
        printCube.apply(20);


    }
}
