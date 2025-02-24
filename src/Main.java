import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double userIncome;
        final double TAX_RATE_TEN = 0.10;
        final double TAX_RATE_FIFTEEN = 0.15;
        final double TAX_RATE_TWENTY = 0.20;
        final double TAX_RATE_THIRTY = 0.30;
        double taxAmount;
        double netIncome;

        System.out.println("Please enter your weekly income using only numbers and decimals (I.E. 1500.00, not $1,500.00): ");
        userIncome = scnr.nextDouble();

        if (userIncome < 500) {
            taxAmount = userIncome * TAX_RATE_TEN;
        } else if (userIncome >= 500 && userIncome < 1500) {
            taxAmount = userIncome * TAX_RATE_FIFTEEN;
        } else if (userIncome >= 1500 && userIncome < 2500) {
            taxAmount = userIncome * TAX_RATE_TWENTY;
        } else {
            taxAmount = userIncome * TAX_RATE_THIRTY;
        }

        netIncome = userIncome - taxAmount;

        System.out.printf("Your total taxes withheld is $%.2f, leaving you with $%.2f for the week.\n", taxAmount, netIncome);

        scnr.close();
    }
}