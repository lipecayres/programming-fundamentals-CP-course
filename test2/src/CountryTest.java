/**	Application Purpose: Build the main method to give the JRE an entry point into the Movie Ticket .  
*	Author: Felipe Cayres
*	Date: Feb 23th, 2023
*	Time: 11:34 PM
*/

  
public class CountryTest {                                                            //Create a second class called MovieTicketTestHarness 
    public static void main (String [] args) {                                                  // Main method
        
          // Instantiate ticket.
        Country c1 = new Country("Brazil", 7000000);   
       
        System.out.println();                                                                   // Jumping line - better visualization
        System.out.println("Country Informations:");                                    // Print "example" title to user        
        System.out.println("--- " + "Name: " + c1.getName());                              // Print First Name     
        System.out.println("--- " +"Population: " + c1.getPopulation());                          // Print Last Name
 

        Country c2 = new Country();
        
        c2.setName("Canada");
        c2.setPopulation(8000000);


        System.out.println();                                                                   // Jumping line - better visualization
        System.out.println("Country Informations:");                                    // Print "example" title to user        
        System.out.println("--- " + "Name: " + c2.getName());                              // Print First Name     
        System.out.println("--- " +"Population: " + c2.getPopulation());                          // Print Last Name
 
        System.out.println(c1.testString("FelipegunSimoesingCayres", 2));   
  }
}

