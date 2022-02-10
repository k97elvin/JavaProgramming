package Day44_Abstraction.animalTask;

public final class Dog extends Animal {

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark() {
        System.out.println(getAge() + " is barking");
    }



    public void eat() {
        System.out.println(getName() + " eats Pizza");
    }


}
