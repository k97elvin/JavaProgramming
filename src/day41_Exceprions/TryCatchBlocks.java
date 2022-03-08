package day41_Exceprions;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Test started");
        try {
            System.out.println(9 / 0);
            System.out.println("Try Block");
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception is occurred");
        }
        System.out.println("Test 1 is completed");

        System.out.println("___________________________________");


        int[] numbers = {1, 2, 3, 4, 5};
       try {
           System.out.println(numbers[200]);
       }catch (Exception e){
        e.printStackTrace();
       }
        System.out.println("Test 2 completed");

        System.out.println("_______________________________________________________");


        try {
            System.out.println();
        }catch (Error e){
            System.out.println(e.getMessage());
        }


    }
}
