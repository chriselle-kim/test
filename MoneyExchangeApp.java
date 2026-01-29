import java.util.Scanner;

public class MoneyExchangeApp {       // main program

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== Money Exchange System ===");

        System.out.println("\n1. Philippine Peso (PhP) ");
        System.out.println("2. United States Dollar (USD) ");
        System.out.println("3. European Euro (EUR) ");
        System.out.print("Select Base Currency: ");   // user input for base currency
        int StartCurr = scanner.nextInt();

        System.out.println("\n1. Philippine Peso (PhP) ");
        System.out.println("2. United States Dollar (USD) ");
        System.out.println("3. European Euro (EUR) ");
        System.out.print("Select Quote Currency: ");  // user input for quote currency
        int EndCurr = scanner.nextInt();

        System.out.print("\nEnter amount to exchange: ");  // user input for amount
        double StartAmount = scanner.nextDouble();

        Transaction transaction = new Transaction (StartCurr, EndCurr, StartAmount);  // create obj transaction
        Currency_Conversion currency_Conversion = new Currency_Conversion ();   // class for conversion proper

        double EndAmount = currency_Conversion.CalculateEndAmount(transaction); // calculate quote amount
    
        Billing bill = new Billing(); // generate billing
        bill.printBill(transaction, currency_Conversion, EndAmount);

        scanner.close();
    }
}



// Chriselle Kim M. Dela Peña
// Rain Ardevela
// Zion Christian Gonzaga
// COM251