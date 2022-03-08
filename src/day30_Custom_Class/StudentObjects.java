package day30_Custom_Class;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Elvin", 'M', 24, 2210, 'A');

        System.out.println(student1);

        Student student2 = new Student();
        student2.setInfo("Kanan", 'M', 38, 2230, 'A');

        Student student3 = new Student();
        student3.setInfo("Hasan", 'M', 36, 2235, 'A');

        Student student4 = new Student();
        student4.setInfo("Roya", 'M', 38, 2260, 'C');

        Student student5 = new Student();
        student5.setInfo("Elmar", 'M', 38, 2250, 'D');

        Student[] students = {student1, student2, student3, student4, student5};

       for (Student student:students){
           System.out.println(student);
       }

        ArrayList<Student>earlyBirds = new ArrayList<>();
        ArrayList<Student>angryBirds = new ArrayList<>();

       for (Student student:students){
           if (student.grade=='A'){
               earlyBirds.add(student);
           }else{
               angryBirds.add(student);
           }

       }
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);

    }
}
