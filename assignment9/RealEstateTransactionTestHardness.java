
/**	
 * Application Purpose: Build the main method to give the JRE an entry point into the Real Estate Transaction.  
*	Author: Felipe Cayres
*	Date: Apr 02, 2023
*	Time: 11:10 PM
*/


import java.util.Scanner;

public class RealEstateTransactionTestHardness {
	public static void main(String[] args) {

		// initializing objects
		Scanner sc = new Scanner(System.in);

		RealEstateTransaction firstRegister = new RealEstateTransaction("115", "The Esplanade", "Toronto", "615000");

		// calling method 1
		firstRegister.generateStateOneString();
		System.out.println("");
 	 	
		// calling method 2
		firstRegister.generateRandomStateOneString();
		System.out.println("");
	
		// calling method 3
		int index1, index2; 
		System.out.print("Type Key Character Number: ");
		index1 = sc.nextInt();
		System.out.print("Type first character index number: ");
		index2 = sc.nextInt();

		System.out.println("\nEncrypted string: ");
		System.out.println(firstRegister.encryptState(index1, index2));
		System.out.println("");
		
	sc.close();
	}
}
