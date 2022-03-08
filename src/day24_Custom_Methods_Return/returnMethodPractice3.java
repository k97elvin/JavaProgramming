package day24_Custom_Methods_Return;

public class returnMethodPractice3 {
    public static void main(String[] args) {

        String str = "aabccdee";

        int frequency = frequency (str, 'a');
    }

    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;


    }
}
