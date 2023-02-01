/**	Application Purpose: Build class to demonstrate the concepts of instance variables, constructors, setters, getters, and blueprint classes.
*	Author: Felipe Cayres
*	Date: Jan 24th, 2023
*	Time: 2:23 PM
*/

    // Class declaration
public class ChequingAccount { 

        // Variables
    private String firstName;
    private String lastName;
    private double balance;
    private int accountNumber;

        // Declaring empty constructor
    public ChequingAccount () {}

        // Behavior - Getters and Setters
    public ChequingAccount (String firstName, String lastName, double balance, int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountNumber=accountNumber;
    }

    // Getters and Setters -> First Name
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public String getFirstName () {
        return firstName;
    }

    // Getters and Setters -> Last Name
    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getLastName () {
        return lastName;
    }

    // Getters and Setters -> Balance
    public void setBalance (double balance){
        this.balance = balance;
    }

    public double getBalance () {
        return balance;
    }

    // Getters and Setters -> Account Number
    public void setAccountNumber (int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber () {
        return accountNumber;
    }
