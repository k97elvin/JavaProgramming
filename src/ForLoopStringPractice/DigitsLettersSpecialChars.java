package ForLoopStringPractice;

import java.util.Scanner;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scan.next();


       if (word.charAt(0)=='x'){word=word.replaceFirst("x","a");
       }

        System.out.println(word);

    }
}
/*Write a program that asks user to enter a word. If the word starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex


 */