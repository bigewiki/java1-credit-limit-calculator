
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
        // display the info (first time)
        System.out.println("===========================");
        account.displayNewBalance();
        account.displayCreditLimitMessage();
        System.out.println("===========================");
        // while loop for repeat user interaction
        while (continueRunning) {
            // let the user decide if they would like to continue
            while (continueRunning) {
                String answer = input.nextLine().trim().toLowerCase();
                if (answer.equals("y")) {
                    System.out.println("===========================");
                } else if (answer.equals("n")) {
                    continueRunning = false;
                } else {
                    System.out.print("Would you like to continue? (y/n): ");
                }
            }
            // prompt user to input new values
            if (continueRunning) {
                System.out.print("Type the new account number: ");
                account.setAccountNummber(input.nextInt());
                System.out.print("Type the new initial balance: ");
                account.setBeginningBalance(input.nextInt());
                System.out.print("Type the new charges on this account: ");
                account.setCharges(input.nextInt());
                System.out.print("Type any new credits paid: ");
                account.setCredits(input.nextInt());
                System.out.print("Type the new credit limit for the account: ");
                account.setCreditLimit(input.nextInt());
            }
            // display the info
            System.out.println("===========================");
            account.displayNewBalance();
            account.displayCreditLimitMessage();
            System.out.println("===========================");
        }
        input.close();
    }
}
