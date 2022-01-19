package Day09;

public class Eligible_to_buy_alcohol {
    public static void main(String[] args) {


        int eligibleAge = 57;
        if (eligibleAge >= 21) {
            System.out.println("the person is eligible to buy alcohol");
        } else if (!(eligibleAge >= 21)) {
            System.out.println("the person is not eligible");
        }
    }
}
