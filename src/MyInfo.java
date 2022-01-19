import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your gender: ");
        String gender = scan.next();
        scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your phone number: ");
        long phone = scan.nextLong();

        System.out.println("Enter your zip code: ");
        int zip = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your school name: ");
        String school = scan.nextLine();

        System.out.println("Enter your city name: ");
        String city = scan.nextLine();

        System.out.println("Enter your state name: ");
        String state = scan.nextLine();

        System.out.println("Enter your building number: ");
        int building = scan.nextInt();

        scan.nextLine();

        System.out.println("enter your street name: ");
        String street = scan.nextLine();

        scan.close();


    }
}
