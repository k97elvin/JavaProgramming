package weekly_Aarons_Questions;

public class Task1_OddEven {
    public static void main(String[] args) {
        oddEven(6);
    }

    public static void oddEven(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is even.");
        } else {
            System.out.println(a + " is odd.");
        }
    }
}
