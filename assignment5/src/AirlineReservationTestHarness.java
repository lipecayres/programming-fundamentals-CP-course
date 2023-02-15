/**	Application Purpose: Build the main method to give the JRE an entry point into the Airline program.  
*	Author: Felipe Cayres
*	Date: Feb 15th, 2023
*	Time: 1:10 PM
*/

// Import statements:
import java.util.Scanner;
    
public class AirlineReservationTestHarness {                                                    //Create a second class called AirlineReservation 
    public static void main (String [] args) {                                                  // Main method
        
                    //
                    // Challenge 4
                    //

        //Instantiate a Airline Reservation object 
        AirlineReservation ar1 = new AirlineReservation("Jack", "Blue", 1020, 3 , 334547);

        //Print out object state.
        System.out.println();                                                                   // Jumping line - better visualization
        System.out.println("Airline Reservation Informations");                              // Print "example" title to user        
        System.out.println("--- " + "First Name: " + ar1.getFirstName());                       // Print First Name     
        System.out.println("--- " +"Last Name: " + ar1.getLastName());                          // Print Last Name
        System.out.println("--- " +"Flight Number: " + ar1.getFlightNumber());                  // Print Flight Number
        System.out.println("--- " +"Seat Number: " + ar1.getSeatNumber());                      // Print Seat Number
        System.out.println("--- " +"Ticket Number: " + ar1.getTicketNumber());                  // Print Ticket Number
        System.out.println("--- " +"Seating Class: " + ar1.retrieveSeatingClass());             // Print Seating Class
        System.out.println("--- " +"Segment State: " + ar1.segmentState());                     // Print Segment State       
        System.out.println("\n----------------------------");                                // Jumping line  and printing a bar to better visualization
        System.out.println("--- " +"No Fly List: " + ar1.checkNoFlyList());   
        
        if(ar1.checkNoFlyList().contains("9999")) {
          System.out.println("ALERT ALERT ALERT ALERT ALERT ALERT ALERT ALERT ALERT");    
        } else {
          System.out.println("--- OK TO GO!");      
        }

                  // Print the checking No Fly List
        System.out.println("\n----------------------------");  


        // Instantiate a second Airline Reservation with no data.
        AirlineReservation ar2 = new AirlineReservation();   
        
        // Ask the user for the data required to fill each field of the reservation
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
        System.out.print("Enter Flight Number: ");                                           // Display appropriate messa to user
        int flightNumber= sc.nextInt();                                                        // Input to Flight Number
        ar2.setFlightNumber(flightNumber);                                                     // Set method to save typed Flight Number
                
                // Register Seat Number
        System.out.print("Enter Seat Number: ");                                             // Display appropriate messa to user
        int seatNumber= sc.nextInt();                                                          // Input to Seat Number
        ar2.setSeatNumber(seatNumber);                                                         // Set method to save typed Seat Number
                
                // Register Flight Number
        System.out.print("Enter Ticket Number: ");                                            // Display appropriate messa to user
        int ticketNumber= sc.nextInt();                                                         // Input to grade course one
        ar2.setTicketNumber(ticketNumber);                                                      // Set method to save typed Ticket Number


        System.out.println();                                                                   // Jumping line - better visualization
        System.out.println("Airline Reservation Informations");                              // Print "example" title to user        
        System.out.println("--- " + "First Name: " + ar2.getFirstName());                       // Print First Name     
        System.out.println("--- " +"Last Name: " + ar2.getLastName());                          // Print Last Name
        System.out.println("--- " +"Flight Number: " + ar2.getFlightNumber());                  // Print Flight Number
        System.out.println("--- " +"Seat Number: " + ar2.getSeatNumber());                      // Print Seat Number
        System.out.println("--- " +"Ticket Number: " + ar2.getTicketNumber());                  // Print Ticket Number
        System.out.println("--- " +"Seating Class: " + ar2.retrieveSeatingClass());             // Print Seating Class
        System.out.println("--- " +"Segment State: " + ar2.segmentState());                     // Print Segment State       
        System.out.println("\n----------------------------");                                // Jumping line  and printing a bar to better visualization
        System.out.println("--- " +"No Fly List: " + ar2.checkNoFlyList());                     // Print No Fly check
        
                // Print the checking No Fly List
        if(ar2.checkNoFlyList().contains("9999")) {                                          // If state to check No List
          System.out.println("ALERT ALERT ALERT ALERT ALERT ALERT ALERT ALERT ALERT");       // Print Alert
        } else {                                                                               // Else state to No Fly check
          System.out.println("--- OK TO GO!");                                               // Print No Fly check
        }

        System.out.println("\n----------------------------");                                // Jumping line - better visualization


        sc.close();                                                                             // Close Scanner
  }
}

