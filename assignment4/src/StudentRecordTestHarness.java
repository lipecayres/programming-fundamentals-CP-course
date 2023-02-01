/**	Application Purpose: Build the main method to give the JRE an entry point into the program.  
*	Author: Felipe Cayres
*	Date: Jan 24th, 2023
*	Time: 02:43 PM
*/
    
public class StudentRecordTestHarness {           // Class declaration
    public static void main (String [] args) {      //Main method
        
        //
        // Challenge 2
        //

        // Declaring the first Student Record (sr) 
        StudentRecord sr1 = new StudentRecord("Joe", "Smith", 86 , 202301001);

        // Printing on screen account informations
    System.out.println();       // Jumping line - better visualization
    System.out.println("Student Record Informations:");
    System.out.println("--- " + "First Name: " + sr1.getFirstName());
    System.out.println("--- " +"Last Name: " + sr1.getLastName());
    System.out.println("--- " +"Student ID: " + sr1.getstudentID());
    System.out.println("--- " +"Grade Course One: " + sr1.getgradeCourseOne());
    
    System.out.println();       // Jumping line - better visualization

    }
}
