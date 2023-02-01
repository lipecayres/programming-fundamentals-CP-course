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

    // Declaring empty constructor
    public StudentRecord  () {}

    // Constructor declaration 
    public StudentRecord  (String firstName, String lastName, double gradeCourseOne, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;           
        this.gradeCourseOne = gradeCourseOne;
        this.studentID = studentID;
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
    this.firstName = lastName;
}

public String getLastName() {
    return lastName;
}

    // Getters and Setters -> Grade Course One

public void setgradeCourseOne(double gradeCourseOne){
    this.gradeCourseOne = gradeCourseOne;
}

public double getgradeCourseOne() {
    return gradeCourseOne;
}

 // Getters and Setters -> Student ID

public void setstudentID(int studentID) {
    this.studentID = studentID;
}

public int getstudentID(){
    return studentID;
}

    // method Get Letter grade - Ranked grade A-F

    public char getLetterGrade (double gradeCourseOne){

        if (gradeCourseOne >=90) {
            return 'A';
        } else if (gradeCourseOne >=80 && gradeCourseOne <90){
            return 'B';
        } else if (gradeCourseOne >=70 && gradeCourseOne <80){
            return 'C';
        } else if (gradeCourseOne >=60 && gradeCourseOne <70){
            return 'D';
        } else if (gradeCourseOne >=50 && gradeCourseOne <60){
            return 'E';
        } else if (gradeCourseOne <50){
            return 'F';
        } else {
            return '#';
        }
    }

}