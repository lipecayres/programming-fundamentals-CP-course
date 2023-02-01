/**	Application Purpose: Build the main method to give the JRE an entry point into the program.  
*	Author: Felipe Cayres
*	Date: Jan 24th, 2023
*	Time: 02:43 PM
*/

// Import statements:
import java.util.Scanner;
    
public class StudentRecordTestHarness {                                                              // Class declaration
    public static void main (String [] args) {                                                      //Main method
        
                    //
                    // Challenge 2
                    //

        // Declaring the first Student Record (sr) 
        StudentRecord sr1 = new StudentRecord("Joe", "Smith", 86 , 202301001);

        // Printing on screen account informations
        System.out.println();                                                                      // Jumping line - better visualization
        System.out.println("Student Record Informations Example:");                                     
        System.out.println("--- " + "First Name: " + sr1.getFirstName());
        System.out.println("--- " +"Last Name: " + sr1.getLastName());
        System.out.println("--- " +"Student ID: " + sr1.getStudentID());
        System.out.println("--- " +"Grade Course One: " + sr1.getgradeCourseOne());
        System.out.println("--- " +"Letter Grade: " + sr1.getLetterGrade());
        
        System.out.println();                                                                      // Jumping line - better visualization

        System.out.println("----------------------------"); 

        //      Step 4 - Instantiate a second student record with no data.
        StudentRecord sr2 = new StudentRecord();

        System.out.print("Registration: \n" + 
                         "Type here the informations about the new student\n\n");

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        
                // Register first name
        System.out.print("Enter First Name: ");  
        String firstName= sc.nextLine();              //reads string   
        sr2.setFirstName(firstName);         

                // Register last name
        System.out.print("Enter Last Name: ");  
        String lastName= sc.nextLine();              //reads string   
        sr2.setLastName(lastName);         

                // Register Grades
        System.out.print("Enter Grade: ");  
        double gradeCourseOne= sc.nextDouble();              //reads string   
        sr2.setgradeCourseOne(gradeCourseOne);  

                // Register Student ID                
        System.out.print("Enter Student ID: ");  
        int studentID= sc.nextInt();              //reads string   
        sr2.setStudentID(studentID);  

        System.out.println();                                                                      // Jumping line - better visualization
        System.out.println("Student Record Informations:");
        System.out.println("--- " + "First Name: " + sr2.getFirstName());
        System.out.println("--- " +"Last Name: " + sr2.getLastName());
        System.out.println("--- " +"Student ID: " + sr2.getStudentID());
        System.out.println("--- " +"Grade Course One: " + sr2.getgradeCourseOne());
        System.out.println("--- " +"Letter Grade: " + sr2.getLetterGrade());
        
        System.out.println();                                                                      // Jumping line - better visualization

        System.out.println("----------------------------"); 

        System.out.println("--- " +"Vowels: " + sr2.getVowelCount());
        
    }
}
