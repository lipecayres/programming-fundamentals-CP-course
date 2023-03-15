/**	Application Purpose: Build a blueprint bank transactions - states and behavior
*	Author: Felipe Cayres
*	Date: Mar 15th, 2023
*	Time: 08:30 AM
*/

    // Step 1      Create a class called MovieTicket 
public class BankTransaction {                       

        // Variables

    private boolean canadianFunds;
    private double exchangeRate;
    private int transactionNumber;
    private long transactionReferenceNumber;


        // Declaring empty constructor
    public BankTransaction () {}

        // Constructor declaration with arguments 
    public BankTransaction (boolean canadianFunds, double exchangeRate, int transactionNumber, long transactionReferenceNumber) {
        this.canadianFunds = canadianFunds;
        this.exchangeRate = exchangeRate;
        this.transactionNumber = transactionNumber;
        this.transactionReferenceNumber = transactionReferenceNumber;

    }

        // Getters and Setters -> Canadian Funds
    public void setCanadianFunds(boolean canadianFunds) {
        this.canadianFunds = canadianFunds;
    }
    public boolean getCanadianFunds(){
        return canadianFunds;
    }

        // Getters and Setters -> Exchange Rates
    public void setExchangeRate(double exchangeRate){
        this.exchangeRate = exchangeRate;
    }
    public double getExchangeRate() {
        return exchangeRate;
    }

        // Getters and Setters -> Transaction Number
    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }
    public int getTransactionNumber(){
        return transactionNumber;
    }

        // Getters and Setters -> Transaction Reference Number
    public void setTransactionReferenceNumber(long transactionReferenceNumber){
        this.transactionReferenceNumber = transactionReferenceNumber;
    }
    public long getTransactionReferenceNumber() {
        return transactionReferenceNumber;
    }

    }
