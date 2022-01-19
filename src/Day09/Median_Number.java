package Day09;

public class Median_Number {
    public static void main(String[] args) {

        int a = 10, b = 40, c = 30;

        //   if(a<b&&a>c)
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);

        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);

        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {
            System.out.println("a is median number");
        }

        if (bIsMedian) {
            System.out.println("b is median number");
        }
        if (cIsMedian) {
            System.out.println("c is median number");
        }


    }
}
