import java.security.Principal;
import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int Principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float AnnualInterest = scanner.nextFloat();
        float monthlyInterest = AnnualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Period in Years: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = Principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        // Format as currency
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Monthly Mortgage Payment: " + mortgageFormatted);


    }

}