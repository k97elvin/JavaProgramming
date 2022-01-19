package Day09;

public class multiple_branch_statements {
    public static void main(String[] args) {
        int n1 = 100, n2 = 200;

        if (n1 > n2) {
            System.out.println(n1 + "is maximum");
        } else if (n2 > n1) {
            System.out.println(n2 + " is maximum");

        } else if(n1==n2) {
            System.out.println("they are equal");
        }
    }
}
/*1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number*/