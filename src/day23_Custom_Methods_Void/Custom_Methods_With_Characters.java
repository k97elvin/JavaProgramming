package day23_Custom_Methods_Void;

public class Custom_Methods_With_Characters {
    public static void main(String[] args) {
        oddOrEven(10);
        age(1997);
        print_number(5,10);
    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    public static void age(int birthYear) {

        int age = 2021 - birthYear;

        System.out.println("Your age is: " + age);
    }

    public static void print_number(int x, int y){
        for (int i = x; i <=y; i++) {
            System.out.println(i);
        }
    }
}
