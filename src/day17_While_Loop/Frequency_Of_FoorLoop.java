package day17_While_Loop;

public class Frequency_Of_FoorLoop {

    public static void main(String[] args) {
        String str = "Java Java python";

        int frequency = 0;

        while (str.contains("Java")){
           str= str.replaceFirst("Java","");
           frequency++;
        }
        System.out.println(frequency);


    }
}
