
/**	
 * Application Purpose: Build the main method to give the JRE an entry point into the Human class.  
*	Author: Felipe Cayres
*	Date: Apr 04, 2023
*	Time: 10:30 PM
*/

public class TestHuman {
	public static void main(String[] args) {

		// initializing objects

		System.out.println("First Register");

		Human register1 = new Human("John", 90);
		System.out.println(register1.getName());
		System.out.println(register1.getWeight());
		System.out.println(Human.city);

		System.out.println();

		Human register2 = new Human();
		
		System.out.println("Second Register");

		register2.setName("Bob");
		register2.setWeight(80);
		
		System.out.println(register2.getName());
		System.out.println(register2.getWeight());
		System.out.println(Human.city);
	}
}