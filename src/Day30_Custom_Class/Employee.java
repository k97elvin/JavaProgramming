package Day30_Custom_Class;

public class Employee {

    public String name;
    public Double salary;
    public String jobTitle;

    public Employee(String name, Double salary, String jobTitle) {
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }


    public static class Dog {
        public String name;
        public String breed;
        public int age;
        public String size;
        public String color;

        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", age=" + age +
                    ", size='" + size + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }

        public void eat() {
            System.out.println(name + "is eating.");

        }

        public void play() {
            System.out.println(name + " is playing");
        }

        public void drink() {
            System.out.println(name + " is playing");
        }
    }
}




