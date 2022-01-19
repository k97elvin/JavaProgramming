package Day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
       /*
        System.out.println(true == !false);
        System.out.println(!true != false); //false
        System.out.println(!false == true); // true

        System.out.println(!!false); //false
        System.out.println(!!!true); //false


        */
        int score = 85; //0-100

        boolean a = score >= 90 && score <= 100;

        boolean b = score >= 80 && !a;
        // boolean b = score >= 80 && score < 90;

        boolean c = score >= 70 && !a && !b;

        boolean d = score >= 60 && !c;

        boolean f = !a && !b && !c && !d;

        if (a) {
            System.out.println("Excllen");
        }
        if (b) {
            System.out.println("Great");
        }
        if (c) {
            System.out.println("Good");
        }
        if (d) {
            System.out.println("Passed");

        }
        if (f) {
            System.out.println("Failed");
        }
    }
}

/*score:
     90-100 ==> Excellent
     80-89 ==> Great
     70-79 ==> Good
     60-69 ==> Passed
     0-59 ==> Failed
 */
