package Day08_IfStatements;

public class logicalOperators {
    public static void main(String[] args) {
        String name = "Elvin";
        int age = 23;
        int creditScore = 720;
        int income = 90000;
        boolean requirement = creditScore >=700 && age>=21 && income>=60_000;
        System.out.println(name + " is eligible for loan: " + requirement);
    }
}
