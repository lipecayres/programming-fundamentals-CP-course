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
    public void setTicketNumber(int ticketNumber){
        this.ticketNumber = ticketNumber;
    }
    public int getTicketNumber() {
        return ticketNumber;
    }

        // Getters and Setters -> Theatre Number
    public void setTheatreNumber(int theatreNumber) {
        this.theatreNumber = theatreNumber;
    }
    public int getTheatreNumber(){
        return theatreNumber;
    }


        // Method Check Palindrome

        public String checkPalindrom () {
            this.movieName = movieName.toLowerCase().replaceAll(" ", "");

            String reverse = "";
            for (int i = movieName.length()-1; i>=0; i--) {
                reverse += (this.movieName).charAt(i);
            }

            if (reverse.equalsIgnoreCase(this.movieName)){
                return "Yes, the movie name is palindrom";
            } else {
                return "No, the movie name is not palindrom";
            }
        }

        // Method Calculate Tax

        public static double getPriceAfterTax (){
            double tax = 0.13;
            return MovieTicket.ticketPrice + (MovieTicket.ticketPrice * tax);
   
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
                    return movie + " is invalid.";
                }
            }
        
        public String inquireMovieRunDates(int ticket) {
        
            switch(ticket){
                case 12345:
                    return "Ticket " + ticket + ": Jan 1, Jan 2, Jan 3";
                case 12346:
                    return "Ticket " + ticket + ": Jan 4, Jan 5, Jan 6";
                case 12347:
                    return "Ticket " + ticket + ": Jan 7, Jan 8, Jan 9";
                case 12348:
                    return "Ticket " + ticket + ": Jan 10, Jan 11, Jan 12";
                default:
                    return "Ticket " + ticket + " is invalid.";
                }
            }
    }
