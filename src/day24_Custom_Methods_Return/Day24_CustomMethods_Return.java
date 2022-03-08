package day24_Custom_Methods_Return;

public class Day24_CustomMethods_Return {
    public static void main(String[] args) {
        domain("k97lvin@gmail.com");
        System.out.println("_________________________________________");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@gmail.com", "Gulsen@gmail.com"};
        System.out.println("______________________________");
        for (String email : emails) {
            domain(email);

        }
        System.out.println("______________________________");

        nameOfMonth(11);
    }

    //1) Domain
    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        System.out.println(domain);
    }

    //2) Name of Month
    public static void nameOfMonth(int number) {
        String name = "";
        // String[] name = {""}
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "Apr"
                    : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ?
                    "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";
        } else {
            name = "invalid";
        }
        System.out.println("name = " + name);
    }
    //3)Name Of Day
    public  static void nameOfDay(int number){

    }
    //4) How many days a month
    public  static void daysInMonth(int number){

    }
    //5) Age Groups
    public  static void Age (int age){

    }
}
