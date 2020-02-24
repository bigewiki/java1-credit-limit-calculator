
/************************************************************/
/*Program:  Credit Limit Calculator                         */
/*CIS163AA                                                  */
/*Edward Muniz                                              */
/*2020-02-23                                                */
/*Determine whether any customers have exceeded             */
/*their credit limit.                                       */
/************************************************************/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // setup the input
        Scanner input = new Scanner(System.in);
        // sentinel boolean allowing the user to stop the program
        Boolean continueRunning = true;
        while (continueRunning) {
            // get user via Scanner
            System.out.print("Type the account number: ");
            Integer accountNumber = input.nextInt();
            System.out.print("Type the account's initial balance: ");
            Integer beginningBalance = input.nextInt();
            System.out.print("Type the charges on this account: ");
            Integer charges = input.nextInt();
            System.out.print("Type any credits paid: ");
            Integer credits = input.nextInt();
            System.out.print("Type the credit limit for the account: ");
            Integer creditLimit = input.nextInt();
            // create the object
            Account account = new Account(accountNumber, beginningBalance, charges, credits, creditLimit);
            // display the info
            System.out.println("===========================");
            account.displayNewBalance();
            account.displayCreditLimitMessage();
            System.out.println("===========================");
            // let the user decide if they would like to continue
            while (true) {
                String answer = input.nextLine().trim().toLowerCase();
                if (answer.equals("y")) {
                    System.out.println("===========================");
                    break;
                } else if (answer.equals("n")) {
                    continueRunning = false;
                    break;
                } else {
                    System.out.print("Would you like to continue? (y/n): ");
                }
            }
        }
        input.close();
    }
}
