package day44_Abstraction.test;

public abstract class AnimalParentClass {
    public String name;
    public int age;

    public AnimalParentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void run();

    public abstract void sleep();

    public String toString() {
        return "AnimalParentClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
