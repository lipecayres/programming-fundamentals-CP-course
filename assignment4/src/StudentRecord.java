/**	Application Purpose: Build a blueprint college student record - states and behavior
*	Author: Felipe Cayres
*	Date: Jan 31st, 2023
*	Time: 8:27 PM
*/

   public class StudentRecord  { 

    // Variables

private String firstName;
private String lastName;
private double gradeCourseOne;
private int studentID;

    // declaring empty constructor
    public StudentRecord  () {}

    // Constructor declaration 
    public StudentRecord  (String firstName, String lastName, double gradeCourseOne, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;           
        this.gradeCourseOne = gradeCourseOne;
        this.studentID = studentID;
    }

        // Setters

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public void setLastName(String lastName) {
    this.firstName = lastName;
}

public void setgradeCourseOne(double gradeCourseOne){
    this.gradeCourseOne = gradeCourseOne;
}

public void setstudentID(int studentID) {
    this.studentID = studentID;
}

        // Setters 

public String getFirstName(){
    return firstName;
}

public String getLastName() {
    return lastName;
}

public double getgradeCourseOne() {
    return gradeCourseOne;
}

public int getstudentID(){
    return studentID;
}

}