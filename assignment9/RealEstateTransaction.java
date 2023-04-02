/**	Application Purpose: Build a blueprint Real Estate Transaction - states and behavior
*	Author: Felipe Cayres
*	Date: Apr 2nd, 2023
*	Time: 07:55 PM
*/
 
public class RealEstateTransaction {                       

    // variables
    private int courseReferenceNumber, courseNumber;

    // declaring empty constructor
    public RealEstateTransaction () {}

    // constructor  with arguments 
    public RealEstateTransaction (int courseReferenceNumber, int courseNumber) {
        this.courseReferenceNumber = courseReferenceNumber;
        this.courseNumber = courseNumber;
    }

        // Getters and Setters -> Course Reference Number
    public void setCourseReferenceNumber(int courseReferenceNumber) {
        this.courseReferenceNumber = courseReferenceNumber;
    }
    public int getCourseReferenceNumber(){
        return courseReferenceNumber;
    }

        // Getters and Setters -> Course Number
    public void setCourseNumber(int courseNumber){
        this.courseNumber = courseNumber;
    }
    public int getCourseNumber() {
        return courseNumber;
    }

}
