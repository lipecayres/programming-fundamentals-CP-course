
/**	
 * Application Purpose: Build the main method to give the JRE an entry point into the Employee class.  
*	Author: Felipe Cayres
*	Date: Apr 04, 2023
*	Time: 10:50 AM 
*/

import java.util.Random;

public class TestEmployee {
	public static void main(String[] args) {

		// initializing objects
		Random rand = new Random();

		int employeeQuantity = 100, counter;

		// Instantiate Employee object.
		Employee[] account = new Employee[employeeQuantity];


		Employee account2 = new Employee;
		Employee account3 = new Employee;

		Employee ac = new Employee();

		counter = 1000;
		for (int i = 0; i < account.length; i++) {

			int salary = rand.nextInt();
			int idNumber = counter;

			ac = new Employee(salary, idNumber);

			account[i] = ac;
			counter++;
		}

		for (int i = 0; i < account.length; i++) {
			if (account[i].getSalary() < 1000 && account[i].getIdNumber() % 2 != 0) {

				System.out.println("Salary: $" + account2.getSalary());
				System.out.println("Id #: " + account[i].getIdNumber());
				System.out.println("------------------------------");

			}

		}

		account2.setSalary(1000);
	}

}