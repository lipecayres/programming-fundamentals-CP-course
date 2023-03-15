/**	Application Purpose: Build the main method to give the JRE an entry point into the Bank Transactions.  
*	Author: Felipe Cayres
*	Date: Mar 15th, 2023
*	Time: 08:50 AM
*/
import java.util.Random;

// Import statements:
public class BankTransactionRecordTestHarness{
    public static void main (String [] args) {
        Random random = new Random();

          // Instantiate Bank Accounts.
        BankTransaction[] account = new BankTransaction[500];   

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


    }
}

