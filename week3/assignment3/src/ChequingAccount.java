/**	Application Purpose: Become familiar with basic operations on Java  
*	Author: Felipe Cayres
*	Date: Jan 18th, 2023
*	Time: 13:00
*/

public class ChequingAccount {

    private String firstName;
    private String lastName;
    private double balance;
    private int accountNumber;

    public ChequingAccount () {}

    public ChequingAccount (String firstName, String lastName, double balance, int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountNumber=accountNumber;
    }

        //
        // Getters and Setters -> First Name
        //

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public String getFirstName () {
        return firstName;
    }
    
        //
        // Getters and Setters -> Last Name
        //

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getLastName () {
        return lastName;
    }

        //
        // Getters and Setters -> Balance
        //
    
    public void setBalance (double balance){
        this.balance = balance;
    }

    public double getBalance () {
        return balance;
    }

        //
        // Getters and Setters -> Account Number
        //

    public void setAccountNumber (int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber () {
        return accountNumber;
    }
}