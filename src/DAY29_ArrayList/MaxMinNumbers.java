package DAY29_ArrayList;

import java.util.ArrayList;

public class MaxMinNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int max = 0;
        int min = 0;
        int sum = 0;
        for (Integer each : list) {
            if (each > max) {
                if (each > max) {
                    max = each;
                }
                if (each < min) {
                    min = each;
                }
                sum += each;
            }
        }
        double average = (double) sum/ list.size();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);
    }
}
