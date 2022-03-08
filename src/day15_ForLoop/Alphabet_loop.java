package day15_ForLoop;

public class Alphabet_loop {
    public static void main(String[] args) {
        //A~Z ++>65~90
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + ",");
        }
        System.out.println("");
        System.out.println("_____________________");


        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + ",");
        }

        System.out.println("");
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + ",");
        }


        System.out.println("\n__________________________");

        for (char i = 'z'; i>='a'; i--){
            System.out.print(i+" ");
        }

        System.out.println("\n__________________________");


        for (char i=1; i<=5000; i++){
            System.out.println(i + "");
        }

    }
}
