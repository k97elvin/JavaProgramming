package day09;

public class Min_Number {
    public static void main(String[] args) {

        int n1 = 100, n2 = 200;

        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n1 > n2;
        boolean equal = n1 == n2;

        if (n1IsMin) {
            System.out.println(n1 + "- is minimum");

        }
        if (n2IsMin) {
            System.out.println(n2 + "- is minimum");

        }
    }
}
