/**	Application Purpose: Build a blueprint movie theatre - states and behavior
*	Author: Felipe Cayres
*	Date: Feb 23rd, 2023
*	Time: 09:27 PM
*/

    // Step 1      Create a class called MovieTicket 
public class MovieTicket {                       

        // Variables

    private String movieName;
    private int ticketNumber;
    private int theatreNumber;

    public static double ticketPrice = 50.0;

    int flightNumber;


        // Declaring empty constructor
    public MovieTicket () {}

        // Constructor declaration with arguments 
    public MovieTicket (String movieName, int ticketNumber, int theatreNumber) {
        this.movieName = movieName;
        this.ticketNumber = ticketNumber;
        this.theatreNumber = theatreNumber;
    }

        // Getters and Setters -> Movie Name
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getMovieName(){
        return movieName;
    }

        // Getters and Setters -> Flight Number
    public void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    public int getFlightNumber() {
        return flightNumber;
    }

        // Getters and Setters -> Theatre Number
    public void setTheatreNumber(int theatreNumber) {
        this.theatreNumber = theatreNumber;
    }
    public int getTheatreNumber(){
        return theatreNumber;
    }


        // Method Check Palindrome

        public boolean checkPalindrom () {
            this.movieName = movieName.toLowerCase().replaceAll(" ", "");
            String invertedName = "";

            for (int i = movieName.length()-1; i<=0; i--) {
                invertedName += this.movieName.charAt(i);
            }

            if (invertedName.equals(movieName)){
                return true;
            } else {
                return false;
            }
        }

        // Method Calculate Tax

        public static double getPriceAfterTax (){
            double tax = 0.13;
            return MovieTicket.ticketPrice * tax;
   
        }

        // Overloaded Method 
        
        public String inquireMovieRunDates(String movie) {
            
            switch(movie){
                case "Die Hard 1":
                    return movie + ": Jan 1, Jan 2, Jan 3";
                case "Die Hard 2":
                    return movie + ": Jan 4, Jan 5, Jan 6";
                case "Die Hard 3":
                    return movie + ": Jan 7, Jan 8, Jan 9";
                case "Die Hard 4":
                    return movie + ": Jan 10, Jan 11, Jan 12";
                default:
                    return "Invalid movie";
                }
            }
        
            public String inquireMovieRunDates(int ticket) {
            
                switch(ticket){
                    case 12345:
                        return ticket + ": Jan 1, Jan 2, Jan 3";
                    case 12346:
                        return ticket + ": Jan 4, Jan 5, Jan 6";
                    case 12347:
                        return ticket + ": Jan 7, Jan 8, Jan 9";
                    case 12348:
                        return ticket + ": Jan 10, Jan 11, Jan 12";
                    default:
                        return "Invalid ticket";
                    }
                }
