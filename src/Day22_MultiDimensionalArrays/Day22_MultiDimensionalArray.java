package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Day22_MultiDimensionalArray {
    public static void main(String[] args) {
        String sentence = "Today is good day";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reverseSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentence += words[i] +" ";

        }
        System.out.println(reverseSentence);
    }
}
