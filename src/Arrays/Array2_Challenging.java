package Arrays;

import java.util.Arrays;

public class Array2_Challenging {
    public static void main(String[] args) {
        char[] letters = new char[26];

        letters[0] = 'A';
        for (char i = 'A',j=0;i<='Z'&& j< letters.length; i++,j++){
            letters[j]=i;

        }

        System.out.println(Arrays.toString(letters));// [A~Z]
    }
}
