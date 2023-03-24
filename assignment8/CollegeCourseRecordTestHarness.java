/**	Application Purpose: Build the main method to give the JRE an entry point into the College Course.  
*	Author: Felipe Cayres
*	Date: Mar 21st, 2023
*	Time: 02:50 PM
*/

import java.util.Random;
import java.util.Scanner;

public class CollegeCourseRecordTestHarness{
	public static void main (String [] args) {

		int row = 200, columns = 10, counter = 0; 
		int courseCode[] = {11001,12002,13003,14004,15005};
		
		Random rand = new Random(); 
		Scanner sc= new Scanner(System.in);

		CollegeCourse cc;

		CollegeCourse [][] collegeData = new CollegeCourse[row][columns];

		for (int i = 0; i<row; i++){
			for (int j = 0; j<columns;j++){
				counter++; 
				
				if (counter <= 1000){
					cc = new CollegeCourse(0,0);

				} else {
					cc = new CollegeCourse(9999,9999);
				}

				collegeData[i][j] = cc;

			System.out.println("Position: " + counter);
			System.out.println("Course Reference Number: " + collegeData[i][j].getCourseReferenceNumber());
			System.out.println("Course Number: " + collegeData[i][j].getCourseNumber());
			System.out.println("------------------------------");


			}
		}

		System.out.println("\n#### Level 2: ####\n");

		// level 2
		counter = 0;
		for (int i = 0; i<row; i++){
			for (int j = 0; j<columns;j++){
				counter++;

				int randomNumber = rand.nextInt(5); 

				cc = new CollegeCourse(counter,courseCode[randomNumber]);

				collegeData[i][j] = cc;

			}

		}

		System.out.println("\n#### Level 3: ####\n");

		// loop to print data
		for (int i = 0; i<row; i++){
			for (int j = 0; j<columns;j++){

				String formatted = String.format("%07d", collegeData[i][j].getCourseReferenceNumber());

				System.out.println("Course Reference Number: " + formatted);
				System.out.println("Course Number: " + collegeData[i][j].getCourseNumber());
				System.out.println("------------------------------");
			}
		}

		// ask user row and columns to print object
		System.out.println("\n#### Level 4: ####\n");

		int pickColumn = 0, pickRow = 0;

		while (pickRow <1 || pickRow > row){
			System.out.println("Pick row position (between 1 and " + row +").");
			pickRow= sc.nextInt();
		}

		while (pickColumn <1 || pickColumn > columns){
			System.out.println("Pick column position (between 1 and " + columns +")." );
			pickColumn = sc.nextInt();;
		}

		pickRow-=1;
		pickColumn-=1;
		
		String formatted = String.format("%07d", collegeData[pickRow][pickColumn].getCourseReferenceNumber());

		System.out.println("------------------------------");
		System.out.println("Index: [" + pickRow + "]["+ pickColumn +"]" );
		System.out.println("Course Reference Number: " + formatted);
		System.out.println("Course Number: " + collegeData[pickRow][pickColumn].getCourseNumber());
		System.out.println("------------------------------");
		sc.close();
	}	

}


