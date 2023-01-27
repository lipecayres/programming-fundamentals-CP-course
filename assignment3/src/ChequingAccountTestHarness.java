/**	Application Purpose: Build the main method to give the JRE an entry point into the program.  
*	Author: Felipe Cayres
*	Date: Jan 24th, 2023
*	Time: 02:43 PM
*/
    
public class ChequingAccountTestHarness {           // Class declaration
    public static void main (String [] args) {      //Main method

        //
        // Challenge 2
        //

        // Declaring the first account data
    ChequingAccount account1 = new ChequingAccount("Joe", "Smith", 300.15 , 102030);

        // Printing on screen account informations
    System.out.println();       // Jumping line - better visualization
    System.out.println("Account Informations:");
    System.out.println("--- " + "First Name: " + account1.getFirstName());
    System.out.println("--- " +"Last Name: " + account1.getLastName());
    System.out.println("--- " +"Balance: $" + account1.getBalance());
    System.out.println("--- " +"Account Number: " + account1.getAccountNumber());
    
    System.out.println();       // Jumping line - better visualization

        //
        // Challenge 3
        //

        // Updating infos using set method
    System.out.println("Account Informations Updated:");
        
        // Updating first name
    account1.setFirstName("Camila");

        // Updating last name
    account1.setLastName("Cayres");

    System.out.println(">>> " + "New First Name: " + account1.getFirstName());
    System.out.println(">>> " + "New Last Name: " + account1.getLastName());
    System.out.println();        // Jumping line - better visualization

        // Printing account informations after update.
    System.out.println("Account Informations:");
    System.out.println("--- " + "First Name: " + account1.getFirstName());
    System.out.println("--- " +"Last Name: " + account1.getLastName());
    System.out.println("--- " +"Balance: $" + account1.getBalance());
    System.out.println("--- " +"Account Number: " + account1.getAccountNumber());

    System.out.println();        // Jumping line - better visualization

    }
}
