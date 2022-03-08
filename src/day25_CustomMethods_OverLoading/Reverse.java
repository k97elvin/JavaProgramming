package day25_CustomMethods_OverLoading;

import utilities.StringUtility;

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
       String reverse =  StringUtility.reverse(str);
        System.out.println(reverse);
    }
}
