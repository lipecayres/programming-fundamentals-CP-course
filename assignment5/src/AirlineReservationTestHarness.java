/**	Application Purpose: Build the main method to give the JRE an entry point into the program.  
*	Author: Felipe Cayres
*	Date: Feb 1st, 2023
*	Time: 08:51 PM
*/

// Import statements:
import java.util.Scanner;
    
public class AirlineReservationTestHarness {                                                         // Step 1            Create a second class called AirlineReservation 
    public static void main (String [] args) {                                                  // Main method
        
                    //
                    // Challenge 4
                    //

        // Step 2             Instantiate a AirlineReservation object 
        AirlineReservation ar1 = new AirlineReservation("Felipe", "Blue", 1020, 3 , 334547);

        // Step 3             Print out the data, including the letter grade, from this first record.
        System.out.println();                                                                   // Jumping line - better visualization
        System.out.println("Airline Reservation Informations");                              // Print "example" title to user        
        System.out.println("--- " + "First Name: " + ar1.getFirstName());                       // Print First Name     
        System.out.println("--- " +"Last Name: " + ar1.getLastName());                          // Print Last Name
        System.out.println("--- " +"Flight Number: " + ar1.getFlightNumber());                  // Print Student ID
        System.out.println("--- " +"Seat Number: " + ar1.getSeatNumber());                      // Print Grade Letter One
        System.out.println("--- " +"Ticket Number: " + ar1.getTicketNumber());                  // Print Letter Grade
        System.out.println("--- " +"Seating Class: " + ar1.retrieveSeatingClass());             // Print Letter Grade
        System.out.println("--- " +"Segment State: " + ar1.segmentState());                   // Print Letter Grade        
        
        System.out.println("\n----------------------------");                                // Jumping line  and printing a bar to better visualization
        System.out.println("--- " +"No Fly List: " + ar1.checkNoFlyList());
        System.out.println("\n----------------------------");  


        // Step 4 - Instantiate a second student record with no data.
        AirlineReservation ar2 = new AirlineReservation();   
        
                // Step 5 - Ask the user for the data required to fill each field of the record
        Scanner sc= new Scanner(System.in);                                                     // Set new Scanner to input data to system.  
        
        System.out.print("Reservation: \n");                                                 // Display appropriate message to user
        System.out.print("Type here the informations about the reservation:\n\n");
        
                // Register first name
        System.out.print("Enter First Name: ");                                               // Display appropriate messa to user
        String firstName= sc.nextLine();                                                        // Input to First Name   
        ar2.setFirstName(firstName);                                                            // Set method to save typed first name

                // Register last name
        System.out.print("Enter Last Name: ");                                                // Display appropriate messa to user
        String lastName= sc.nextLine();                                                         // Input to last Name
        ar2.setLastName(lastName);                                                              // Set method to save typed last name

                // Register Flight Number
        System.out.print("Enter Flight Number: ");                                                    // Display appropriate messa to user
        int flightNumber= sc.nextInt();                                                 // Input to grade course one
        ar2.setFlightNumber(flightNumber);                                                  // Set method to save typed grade course one
                
                // Register Seat Number
        System.out.print("Enter Seat Number: ");                                                    // Display appropriate messa to user
        int seatNumber= sc.nextInt();                                                 // Input to grade course one
        ar2.setSeatNumber(seatNumber); 
                
                // Register Flight Number
        System.out.print("Enter Ticket Number: ");                                                    // Display appropriate messa to user
        int ticketNumber= sc.nextInt();                                                 // Input to grade course one
        ar2.setTicketNumber(ticketNumber);         


        System.out.println();                                                                   // Jumping line - better visualization
        System.out.println("Airline Reservation Informations");                              // Print "example" title to user        
        System.out.println("--- " + "First Name: " + ar2.getFirstName());                       // Print First Name     
        System.out.println("--- " +"Last Name: " + ar2.getLastName());                          // Print Last Name
        System.out.println("--- " +"Flight Number: " + ar2.getFlightNumber());                  // Print Student ID
        System.out.println("--- " +"Seat Number: " + ar2.getSeatNumber());                      // Print Grade Letter One
        System.out.println("--- " +"Ticket Number: " + ar2.getTicketNumber());                  // Print Letter Grade
        System.out.println("--- " +"Seating Class: " + ar2.retrieveSeatingClass());             // Print Letter Grade
        System.out.println("--- " +"Segment State: " + ar2.segmentState());                   // Print Letter Grade        
        
        System.out.println("\n----------------------------");                                // Jumping line  and printing a bar to better visualization
        System.out.println("--- " +"No Fly List: " + ar2.checkNoFlyList());
        System.out.println("\n----------------------------");  





  }
}
