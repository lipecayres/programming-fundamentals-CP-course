/**	Application Purpose: Build the main method to give the JRE an entry point into the Movie Ticket .  
*	Author: Felipe Cayres
*	Date: Feb 23th, 2023
*	Time: 11:34 PM
*/

// Import statements:
import java.util.Scanner;
    
public class MovieTicketTestHarness {                                                            //Create a second class called MovieTicketTestHarness 
    public static void main (String [] args) {                                                  // Main method
        
          // Instantiate ticket.
        MovieTicket mt1 = new MovieTicket();   
        
        // Ask the user for the data required to fill each field of the ticket
        Scanner sc= new Scanner(System.in);                                                     // Set new Scanner to input data to system.  
        
        System.out.print("\nMovie Ticket's Information: \nInsert here the requested informations:\n\n");                                  // Display appropriate message to user
        
                // Register Movie name
        System.out.print("Enter Movie Name: ");                                               // Display appropriate message to user
        String movieName= sc.nextLine();                                                        // Input to Movie Name   
        mt1.setMovieName(movieName);                                                            // Set method to save inserted data


                // Register Ticket Number
        System.out.print("Enter Ticket Number: ");                                           // Display appropriate messa to user
        int ticketNumber= sc.nextInt();                                                        // Input to Ticket Number
        mt1.setTicketNumber(ticketNumber);                                                     // Set method to save typed inserted data
                
                // Register Theatre Number
        System.out.print("Enter Theatre Number: ");                                             // Display appropriate messa to user
        int theatreNumber= sc.nextInt();                                                          // Input to Theatre Number
        mt1.setTheatreNumber(theatreNumber);                                                      // Set method to save typed inserted data

                // Display Movie Ticket's Informations
        System.out.println("\nMovie Ticket's Informations");                                 // Display appropriate message to user       
        System.out.println("--- " + "Movie Name: " + mt1.getMovieName());                       // Print Movie Name     
        System.out.println("--- " +"Ticket Number: " + mt1.getTicketNumber());                  // Print Ticket Number
        System.out.println("--- " +"Theatre Number: " + mt1.getTheatreNumber());                // Print Theatre Number
 
                // Display Prices
        System.out.println("\n--- " + "Price: $" + MovieTicket.ticketPrice);                           // Print Price before tax
        System.out.printf("--- " + "Price after tax: $%.2f\n", MovieTicket.getPriceAfterTax());         // Print Price after tax

                //BUG FIX
        movieName= sc.nextLine();                                                                // BUX FIX - Jumping input line

                // Display Available Dates | Movie
        System.out.print("\nEnter Movie Name: ");                                                    // Display appropriate messa to user        
        movieName= sc.nextLine();                                                                       // Input to Movie Number
        System.out.println("\nAvailable Dates: \n--- " + mt1.inquireMovieRunDates(movieName));         // Display Available Dates

                // Display Available Dates | Ticket                
        System.out.print("\nEnter Ticket Number: ");                                                  // Display appropriate messa to user
        ticketNumber= sc.nextInt();                                                                     // Input to Ticket Number
        System.out.println("\nAvailable Dates: \n--- " + mt1.inquireMovieRunDates(ticketNumber));      // Display Available Dates

                // Palindrome Check        
        System.out.println("\n--- " +"Palindrom Check: " + mt1.checkPalindrom());                       // Print palindrome check

        System.out.println("\n----------------------------");                                // Jumping line - better visualization

        sc.close();                                                                             // Close Scanner
  }
}

