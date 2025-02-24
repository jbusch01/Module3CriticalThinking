package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double userIncome;
        double taxAmount;
        double netIncome;
        double taxRate;
        final double TAX_RATE_TEN = 0.10;
        final double TAX_RATE_FIFTEEN = 0.15;
        final double TAX_RATE_TWENTY = 0.20;
        final double TAX_RATE_THIRTY = 0.30;


        System.out.println("Please enter your weekly income using only numbers and decimals (e.g. 1500.00): ");
        userIncome = scnr.nextDouble();

        if (userIncome < 500) {
            taxRate = TAX_RATE_TEN;
        } else if (userIncome < 1500) {
            taxRate = TAX_RATE_FIFTEEN;
        } else if (userIncome < 2500) {
            taxRate = TAX_RATE_TWENTY;
        } else {
            taxRate = TAX_RATE_THIRTY;
        }

        taxAmount = userIncome * taxRate;
        netIncome = userIncome - taxAmount;

        System.out.printf("Your total taxes withheld is $%.2f, leaving you with $%.2f for the week.\n", taxAmount, netIncome);

        scnr.close();
    }
}