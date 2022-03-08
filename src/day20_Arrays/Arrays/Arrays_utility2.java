package day20_Arrays.Arrays;
import java.util.Arrays;
public class Arrays_utility2 {
    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 2);

        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("______________________________");

        int[]num = {1,2,3,4,5,6,7,8,9,10};

        num=Arrays.copyOf(num,4);
        System.out.println(Arrays.toString(num));


        System.out.println("_____________________________");
       char[]ch1 = {'A','B','C','D','E'};
       char[]ch2 = Arrays.copyOf(ch1,3);
        System.out.println(Arrays.toString(ch2));
        System.out.println("_____________________________");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[]res = Arrays.copyOfRange(scores,3,5);
        System.out.println(Arrays.toString(res));
    }
}
