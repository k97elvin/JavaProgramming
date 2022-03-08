package day20_Arrays;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "acdbe";
        String str2 = "dbcaz";

        // write a program that can check if str1 & str2 are build out same characters

      char[]ch1 = str1.toCharArray();
      char[]ch2= str1.toCharArray();

      Arrays.sort(ch1);
      Arrays.sort(ch2);
    }
}
