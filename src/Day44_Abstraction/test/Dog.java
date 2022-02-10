package Day44_Abstraction.test;

public class Dog extends AnimalParentClass implements AnimalInterface{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }


    @Override
    public void toPee() {

    }
}
