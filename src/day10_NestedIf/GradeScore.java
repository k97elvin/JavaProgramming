package day10_NestedIf;

public class GradeScore {
    public static void main(String[] args) {
        int score = 150;

        if (score > 0 && score <= 100) {//if the score is valid there are 5 possibilities(A,b,c,d,f)
            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("Failed");
            }


        } else {
            System.out.println("Invalid score");
        }
    }
}
