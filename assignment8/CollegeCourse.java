/**	Application Purpose: Build a blueprint College Course - states and behavior
*	Author: Felipe Cayres
*	Date: Mar 21st, 2023
*	Time: 02:40 PM
*/
 
public class CollegeCourse {                       

    // variables
    private int courseReferenceNumber, courseNumber;

    // declaring empty constructor
    public CollegeCourse () {}

    // constructor  with arguments 
    public CollegeCourse (int courseReferenceNumber, int courseNumber) {
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
