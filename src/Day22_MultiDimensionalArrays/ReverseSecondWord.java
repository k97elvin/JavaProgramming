package Day22_MultiDimensionalArrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence = "I love java";

        String[] words = sentence.split(" ");

        String reverse = "";

        for (int i = words[2].length()-1; i >=0; i--) {
            reverse +=words[2].charAt(i);
        }
        System.out.println(reverse);

    }
}
