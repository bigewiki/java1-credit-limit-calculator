/************************************************************/
/*Program:  Credit Limit Calculator                         */
/*CIS163AA                                                  */
/*Edward Muniz                                              */
/*2020-02-23                                                */
/*Determine whether any customers have exceeded             */
/*their credit limit.                                       */
/************************************************************/

public class Account {
    private Integer accountNumber;
    private Integer beginningBalance;
    private Integer charges;
    private Integer credits;
    private Integer creditLimit;

    // constructor
    public Account(Integer initAccountNumber, Integer initBeginningBalance, Integer initCharges, Integer initCredits,
            Integer initCreditLimit) {
        accountNumber = initAccountNumber;
        beginningBalance = initBeginningBalance;
        charges = initCharges;
        credits = initCredits;
        creditLimit = initCreditLimit;
    }

    // calculate new balance
    public Integer getNewBalance() {
        return (beginningBalance + charges - credits);
    }

    // display new balance
    public void displayNewBalance() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("New account balance: $" + getNewBalance());
        System.out.println("Credit limit: $" + creditLimit);
    }

    // determine whether new balance exceeds customer's credit limit, is right on
    // limit, or under limit
    public void displayCreditLimitMessage() {
        if (getNewBalance().equals(creditLimit)) {
            System.out.println("Credit is right on limit");
        } else if (getNewBalance() > creditLimit) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("Credit is under limit");
        }
    }

    public void setAccountNummber(Integer input) {
        accountNumber = input;
    }

    public void setBeginningBalance(Integer input) {
        beginningBalance = input;
    }

    public void setCharges(Integer input) {
        charges = input;
    }

    public void setCredits(Integer input) {
        credits = input;
    }

    public void setCreditLimit(Integer input) {
        creditLimit = input;
    }

}