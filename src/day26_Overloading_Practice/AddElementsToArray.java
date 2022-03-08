package day26_Overloading_Practice;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        arr = addElement(arr, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println("________________________");

        double[] arr2 = {1, 2, 3, 4, 5, 6};
        arr2 = addDouble(arr2, 8);
        System.out.println(Arrays.toString(arr2));

        System.out.println("_____________________________");

        String[] str = {"Elvin", "Ali", "Rasim", "Hasan"};
        str = addString(str, "Adash");
        System.out.println(Arrays.toString(str));

        System.out.println("________________________________________");
        char[] ch = {'e', 'l', 'v', 'i'};
        ch = addChar(ch, 'n');
        System.out.println(Arrays.toString(ch));
        System.out.println("_______________________");
        String[] names ={"Elvin","Elshan","Nadjaf"};
        names=addString(names,"Husein");
        System.out.println(Arrays.toString(names));
    }


    public static int[] addElement(int arr[], int element) {
        int[] result = new int[arr.length + 1];
        int i = 0;
        for (int each : arr) {
            result[i++] = each;

        }

        result[i] = element;
        return result;
    }

    public static double[] addDouble(double[] arr, double element) {
        double[] result = new double[arr.length + 1];
        int i = 0;
        for (double each : arr) {
            result[i++] = each;

        }

        result[i] = element;
        return result;
    }

    public static String[] addString(String[] str, String element) {
        String result[] = new String[str.length + 1];
        int i = 0;
        for (String each : str) {
            result[i++] = each;

        }
        result[result.length - 1] = element;

        return result;

    }

    public static char[] addChar(char[] arr, char element) {
        char res[] = new char[arr.length + 1];
        int i = 0;
        for (char each : arr) {
            res[i++] = each;
        }
        res[res.length - 1] = element;
        return res;

    }


}
