package ForLoopStringPractice;

import java.util.Scanner;

public class Frequency_Interview_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        for (int j = 0; j < word.length(); j++) {
            char ch = word.charAt(j);

            char any = 'a';
            int numOfFrequency = 0;
            for (int i = 0; i < word.length(); i++) {
                char each = word.charAt(i);
                if (any == each) {
                    numOfFrequency++;
                }
            }
            System.out.println(numOfFrequency);

        }}}