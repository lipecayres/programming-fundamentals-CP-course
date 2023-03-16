/**	Application Purpose: Build the main method to give the JRE an entry point into the Bank Transactions.  
*	Author: Felipe Cayres
*	Date: Mar 15th, 2023
*	Time: 08:50 AM
*/

// Import statements:
import java.util.Random;
import java.util.Scanner;


public class BankTransactionRecordTestHarness{
	public static void main (String [] args) {

	Random random = new Random();

	int accountQuantity = 500;
		// Instantiate Bank Accounts.
	BankTransaction[] account = new BankTransaction[accountQuantity];   

	System.out.println("\nBank Account Informations\n-----------------------");  

	for (int i = 0; i<account.length;i++){
			boolean canadianFunds = random.nextBoolean();
			double exchangeRate = random.nextDouble();
			int transactionNumber = random.nextInt();
			long transactionReferenceNumber = random.nextLong();
			
			account[i] = new BankTransaction(canadianFunds, exchangeRate, transactionNumber, transactionReferenceNumber);

			account[i].setCanadianFunds(canadianFunds);
			account[i].setExchangeRate(exchangeRate);
			account[i].setTransactionNumber(transactionNumber);
			account[i].setTransactionReferenceNumber(transactionReferenceNumber);
	}

        for (int i=0; i<accountQuantity; i++){
                System.out.println("--- " + "Canadian Funds: " + account[i].getCanadianFunds());     
                System.out.println("--- " +"Exchange Rate: " + account[i].getExchangeRate());
                System.out.println("--- " +"Transaction Number: " + account[i].getTransactionNumber());
                System.out.println("--- " +"Transaction Reference Number: " + account[i].getTransactionReferenceNumber());
                System.out.println("\n-----------------------\n");

        }

}