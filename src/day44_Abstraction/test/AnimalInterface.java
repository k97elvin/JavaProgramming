package day44_Abstraction.test;

public interface AnimalInterface {

    public abstract void toPee();

    default void toRun(){};

    static void wakeUp(){

    };
}
