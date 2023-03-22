/**	Application Purpose: Build the main method to give the JRE an entry point into the College Course.  
*	Author: Felipe Cayres
*	Date: Mar 21st, 2023
*	Time: 02:50 PM
*/


public class CollegeCourseRecordTestHarness{
	public static void main (String [] args) {

		int row = 200, columns = 10, counter = 0; 

		CollegeCourse [][] collegeData = new CollegeCourse[row][columns];

		for (int i = 0; i<row; i++){
			for (int j = 0; j<columns;j++){
				counter++; 
				CollegeCourse cc;
				
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
}}
