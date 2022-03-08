package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3,3, 4, 3,5));

        System.out.println(list);

        list.removeAll(Arrays.asList(3));
        System.out.println(list);
        System.out.println("___________________________________");

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,4000,500,600));

        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);


    }
}
