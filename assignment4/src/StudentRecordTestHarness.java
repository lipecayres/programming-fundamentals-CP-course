/**	Application Purpose: Build the main method to give the JRE an entry point into the program.  
*	Author: Felipe Cayres
*	Date: Jan 24th, 2023
*	Time: 02:43 PM
*/

// Import statements:
import java.util.Scanner;
    
public class StudentRecordTestHarness {                                                         // Step 1            Create a second class called StudentRecordTestHarness 
    public static void main (String [] args) {                                                  // Main method
        
                    //
                    // Challenge 2
                    //

        // Step 2             Instantiate a StudentRecord object 
        StudentRecord sr1 = new StudentRecord("Joe", "Smith", 86 , 202301001);

        // Step 3             Print out the data, including the letter grade, from this first record.
        System.out.println();                                                                   // Jumping line - better visualization
        System.out.println("Student Record Informations Example:");                           // Print "example" title to user        
        System.out.println("--- " + "First Name: " + sr1.getFirstName());                       // Print First Name     
        System.out.println("--- " +"Last Name: " + sr1.getLastName());                          // Print Last Name
        System.out.println("--- " +"Student ID: " + sr1.getStudentID());                        // Print Student ID
        System.out.println("--- " +"Grade Course One: " + sr1.getgradeCourseOne());             // Print Grade Letter One
        System.out.println("--- " +"Letter Grade: " + sr1.getLetterGrade());                    // Print Letter Grade
        
        System.out.println("\n----------------------------");                                // Jumping line  and printing a bar to better visualization


        // Step 4 - Instantiate a second student record with no data.
        StudentRecord sr2 = new StudentRecord();                

        // Step 5 - Ask the user for the data required to fill each field of the record
        System.out.print("Registration: \n");                                                 // Display appropriate message to user
        System.out.print("Type here the informations about the new student\n\n")
        
        Scanner sc= new Scanner(System.in);                                                     // Set new Scanner to input data to system.  
        
                // Register first name
        System.out.print("Enter First Name: ");                                               // Display appropriate messa to user
        String firstName= sc.nextLine();                                                        // Input to First Name   
        sr2.setFirstName(firstName);                                                            // Set method to save typed first name

                // Register last name
        System.out.print("Enter Last Name: ");                                                // Display appropriate messa to user
        String lastName= sc.nextLine();                                                         // Input to last Name
        sr2.setLastName(lastName);                                                              // Set method to save typed last name

                // Register Grades
        System.out.print("Enter Grade: ");                                                    // Display appropriate messa to user
        double gradeCourseOne= sc.nextDouble();                                                 // Input to grade course one
        sr2.setgradeCourseOne(gradeCourseOne);                                                  // Set method to save typed grade course one

                // Register Student ID                
        System.out.print("Enter Student ID: ");                                               // Display appropriate messa to user
        int studentID= sc.nextInt();                                                            // Input to student ID
        sr2.setStudentID(studentID);                                                            // Set method to save typed first name

        System.out.println();                                                                   // Jumping line - better visualization
        System.out.println("Student Record Informations:");                                   // Print title to user - inputed data
        System.out.println("--- " + "First Name: " + sr2.getFirstName());                       // Print first Name
        System.out.println("--- " +"Last Name: " + sr2.getLastName());                          // Print last Name
        System.out.println("--- " +"Student ID: " + sr2.getStudentID());                        // Print Student ID
        System.out.println("--- " +"Grade Course One: " + sr2.getgradeCourseOne());             // Print Grade course ONE
        System.out.println("--- " +"Letter Grade: " + sr2.getLetterGrade());                    // Print Letter Grade
        
        System.out.println("\n----------------------------");                                // Jumping line  and printing a bar to better visualization

        System.out.println("--- " +"Vowels: " + sr2.getVowelCount());
        
    }
}
