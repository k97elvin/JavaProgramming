package weekly_Aarons_Questions;

public class T3_Finra {
    public static void main(String[] args) {
        finRA();
    }

    public static void finRA() {
        for (int i = 1; i < 31; i++) {
            if (i % 15 == 0) {
                if (i == 30) {
                    System.out.println("FINRA.");
                    break;
                }
                System.out.print("FINRA, ");
            } else if (i % 5 == 0) {
                System.out.print("RA, ");
            } else if (i % 3 == 0) {
                System.out.print("FIN, ");
            } else {
                System.out.print(i + ", ");
            }

        }

    }
}
/*2. Write a method which prints out the numbers from
1 to 100 butfor numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,
 for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5,
  print "RA" instead of the number.*/
