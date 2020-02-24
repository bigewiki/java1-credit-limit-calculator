/************************************************************/
/*Program:  Credit Limit Calculator                         */
/*CIS163AA                                                  */
/*Edward Muniz                                              */
/*2020-02-23                                                */
/*Determine whether any customers have exceeded             */
/*their credit limit.                                       */
/************************************************************/

public class App {
    public static void main(String[] args) {

        Account account1 = new Account(12345, 1500, 500, 100, 2000);
        account1.displayNewBalance();
        account1.displayCreditLimitMessage();
    }
}
