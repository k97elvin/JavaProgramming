package Day42_CatchBlock;

public class MorningWorkout {
    public static void main(String[] args) {

        for (int i = 0; i <= 30; i++) {


            System.out.print("\rPush up" + i);
           sleep(0.5);

        }

        System.out.println("--------------push up completed-------------");


    }
    public static void sleep(double seconds){

        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}

