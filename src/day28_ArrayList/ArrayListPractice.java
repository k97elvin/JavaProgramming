package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }
        System.out.println(list);

        System.out.println("_______________________________");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Elvin");
        employees.add("Rza");
        employees.add("Ali");
        employees.add("Kanan");
        employees.add("Josh");

        System.out.println(employees);

        employees.remove(employees.indexOf("Elvin"));
        System.out.println(employees);

        System.out.println("_______________________");

        employees.set(1, "Elvin");
        System.out.println(employees);

        System.out.println("_______________________");

        employees.add(2, "Rza");
        System.out.println(employees);

        employees.remove("Elvin");
        System.out.println(employees);

    }

}
