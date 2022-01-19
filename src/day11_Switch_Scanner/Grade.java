package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char ch = 'A';
        String res = "";
        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                res = "passed";
                break;
            case 'F':
                res = "failed";
            default:
                System.out.println("ivalid");
        }
        System.out.println(res);

    }
}
