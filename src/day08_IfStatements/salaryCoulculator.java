package day08_IfStatements;

public class salaryCoulculator {
    public static void main(String[] args) {
        int hourly = 50,
                weekly = 45;

        double stateTaxRate = 0,
                federalTaxRate = 26.2;

        int salaryBeforeTax = hourly * weekly * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is; $" + salaryBeforeTax);
        System.out.println("State tax = $" + stateTax);
        System.out.println("Federal tax = $" + federalTax);
        System.out.println("Total tax = $" + totalTax);
        System.out.println("Net income = $" + salaryAfterTax);
    }
}
