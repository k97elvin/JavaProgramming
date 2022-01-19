package Day20_Arrays.Arrays;

import java.util.Arrays;

public class ArraysUtility  {
    public static void main(String[] args) {
        int[] scores = {95, 100, 55, 65, 85, 78};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min score : " + scores[0] + "\n max scpre : "+ scores[scores.length-1]);
    }

}
