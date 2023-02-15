/**	Application Purpose: Build a blueprint college student record - states and behavior
*	Author: Felipe Cayres
*	Date: Jan 31st, 2023
*	Time: 8:27 PM
*/

    // Step 1      Create a class called StudentRecord 
public class AirlineReservation {                       

        // Variables

    private String firstName;
    private String lastName;
    private int flightNumber;
    private int seatNumber;
    private int ticketNumber;

        // Declaring empty constructor
    public AirlineReservation () {}

        // Constructor declaration with arguments 
    public AirlineReservation (String firstName, String lastName, int flightNumber, int seatNumber, int ticketNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.ticketNumber = ticketNumber;           

    }

        // Getters and Setters -> First Name

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

        // Getters and Setters -> Last Name

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

        // Getters and Setters -> Flight Number

    public void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }

    public double getFlightNumber() {
        return flightNumber;
    }

        // Getters and Setters -> Seat Number

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber(){
        return seatNumber;
    }

            // Getters and Setters -> Ticket Number

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getTicketNumber(){
        return ticketNumber;
    }
        // Method Get Letter grade - Ranked grade A-F

    public String retrieveSeatingClass (){          
           
        String seatingClass;

        switch(this.seatNumber){
            case 1:
            case 2:
                seatingClass = "First Class"; 
                break;
            case 3:
            case 4:
                seatingClass = "Second Class"; 
                break;
            case 5:
            case 6:
                seatingClass = "Third Class"; 
                break;
            case 7:
            case 8:
                seatingClass = "Fourth Class"; 
                break;
            default:
                seatingClass = "Invalid";
            }

            return seatingClass;
    }


            //
            // Challenge 2
            // 

   
}