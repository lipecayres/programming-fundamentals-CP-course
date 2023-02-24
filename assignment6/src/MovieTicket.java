/**	Application Purpose: Build a blueprint movie theatre - states and behavior
*	Author: Felipe Cayres
*	Date: Feb 23rd, 2023
*	Time: 09:27 PM
*/

    // Step 1      Create a class called MovieTicket 
public class MovieTicket {                       

        // Variables

    private String firstName;
    private String lastName;
    private int flightNumber;
    private int seatNumber;
    private int ticketNumber;

        // Declaring empty constructor
    public MovieTicket () {}

        // Constructor declaration with arguments 
    public MovieTicket (String firstName, String lastName, int flightNumber, int seatNumber, int ticketNumber) {
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
    public int getFlightNumber() {
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

        // Method Retrieve Seating Class

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
                seatingClass = "Economy Class";
            }
            return seatingClass;
    }

            //
            // Challenge 2
            // 

    // Method called “checkNoFlyList” to check passenger     

    public String checkNoFlyList(){
        String passengerKeyCode = firstName + lastName;
        String [] passengersList = {"Jack Blue", "Jack Green", "Jill White"};
        String returnValue = "0000";

        for (int i=0; i< passengersList.length; i++){

            if (passengerKeyCode.equalsIgnoreCase(passengersList[i].replaceAll(" ", ""))){
                returnValue = "9999";

            }
        }

        return returnValue;
    }

            //
            // Challenge 3
            // 

    // Challenge 3: Method called “checkNoFlyList” to check passenger

    public String segmentState(){
        String fullyString = firstName + lastName + flightNumber + seatNumber + ticketNumber;

        String firstNumber = Integer.toString(ticketNumber);

        int index1 = Character.getNumericValue(firstNumber.charAt(0));
        int index2 = Character.getNumericValue(firstNumber.charAt(firstNumber.length()-1));

        return fullyString.substring(index1, index2);        
    
    }
}