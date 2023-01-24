public class StudentRecord {

    private String fullName;
    private int studentNumber;

    public StudentRecord () {}

    public StudentRecord (String fullName, int studentNumber){
        this.fullName = fullName;
        this.studentNumber = studentNumber;
    }

            // Getters and Setters -> Full Name    
    public void setFullName (String fullName){
        this.fullName = fullName;
    }

    public String getFullName () {
        return fullName;
    }

        // Getters and Setters -> STUDENT NUMBER
    public void setStudentNumber (int studentNumber){
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber () {
        return studentNumber;
    }



    
}
