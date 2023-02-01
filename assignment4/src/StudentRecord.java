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
    this.lastName = lastName;
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

public void setStudentID(int studentID) {
    this.studentID = studentID;
}

public int getStudentID(){
    return studentID;
}

    // method Get Letter grade - Ranked grade A-F

    public char getLetterGrade (){
           char x = '#';
        if (gradeCourseOne >=90) {
            x = 'A';
        } else if (gradeCourseOne >=80 && gradeCourseOne <90){
            x = 'B';
        } else if (gradeCourseOne >=70 && gradeCourseOne <80){
            x = 'C';
        } else if (gradeCourseOne >=60 && gradeCourseOne <70){
            x = 'D';
        } else if (gradeCourseOne >=50 && gradeCourseOne <60){
            x = 'E';
        } else if (gradeCourseOne <50){
            x = 'F';
        } else {
            x = '#';
        }
        return x;
    }

    // Method - Vowels counter

    public int getVowelCount(){
        int counterVowels = 0;
        firstName = firstName.toLowerCase();

        for (int i = 0, n=firstName.length() ; i<n; i++){
            if (firstName.charAt(i) == 'a' || firstName.charAt(i) == 'e' || firstName.charAt(i) == 'i' || firstName.charAt(i) == 'o' || firstName.charAt(i) == 'u') {
                counterVowels++;
            }
        }
    return counterVowels;
}


}