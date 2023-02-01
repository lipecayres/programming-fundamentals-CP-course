/**	Application Purpose: Build a blueprint college student record - states and behavior
*	Author: Felipe Cayres
*	Date: Jan 31st, 2023
*	Time: 8:27 PM
*/

    // Step 1      Create a class called StudentRecord 
public class StudentRecord  {                       

        // Variables

    private String firstName;
    private String lastName;
    private double gradeCourseOne;
    private int studentID;

        // Declaring empty constructor
    public StudentRecord  () {}

        // Constructor declaration with arguments 
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

        // Method Get Letter grade - Ranked grade A-F

    public char getLetterGrade (){          
           char gradeLetter = '#';                                              // Variable to save the grade letter 
        if (gradeCourseOne >=90) {                                              // Condition to grade A
            gradeLetter = 'A';
        } else if (gradeCourseOne >=80 && gradeCourseOne <90){                  // Condition to grade B
            gradeLetter = 'B';
        } else if (gradeCourseOne >=70 && gradeCourseOne <80){                  // Condition to grade C
            gradeLetter = 'C';
        } else if (gradeCourseOne >=60 && gradeCourseOne <70){                  // Condition to grade D
            gradeLetter = 'D';
        } else if (gradeCourseOne >=50 && gradeCourseOne <60){                  // Condition to grade E
            gradeLetter = 'E';
        } else if (gradeCourseOne <50){                                         // Condition to grade F
            gradeLetter = 'F';
        } else {
            gradeLetter = '#';                                                  // Condition to any other option (default error)
        }
        return gradeLetter;                                                     // Returning the grade letter.
    }

    // Method Get Vowel Count - First name's vowels counter

    public int getVowelCount(){
        int counterVowels = 0;                                                  // Set a counter to save the quantity of vowels                                  
        firstName = firstName.toLowerCase();                                    // Converting input to lowercase (validity purpose)

        for (int i = 0, n=firstName.length() ; i<n; i++){                       // Iteraction to check if the letter ia a vowel
            if (firstName.charAt(i) == 'a' || firstName.charAt(i) == 'e' || 
                firstName.charAt(i) == 'i' || firstName.charAt(i) == 'o' ||     // Conditions to be a vowel or not
                firstName.charAt(i) == 'u') {
                    counterVowels++;                                            // Add 1 to each vowel found at iteraction
            }
        }
    return counterVowels;                                                       // Returning the quantity of vowels at first name.
    }


}