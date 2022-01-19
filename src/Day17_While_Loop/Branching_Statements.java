package Day17_While_Loop;

public class Branching_Statements {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
            if (i == 'F') {
    break;
            }
        }
    }
}
