import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    /** Creates a new BankAccount object.
     *
     * @param name the customer's name
     * @param accountCategory the type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        Bank.totalAccounts++;
    }

    /** Returns the owner's balance.
     *
     * @return the balance of the account
     */
    public double getBalance() {
        return accountBalance;
    }

    /** Sets the account's balance.
     *
     * @param setBalance the new balance
     */
    public void setBalance(final double setBalance) {
        accountBalance = setBalance;
    }

    /** Returns the owner's name.
     *
     * @return the name of the customer
     */
    public String getName() {
        return ownerName;
    }

    /** Sets the owner's name.
     *
     * @param setName the new name
     */
    public void setName(final String setName) {
        ownerName = setName;
    }
}
