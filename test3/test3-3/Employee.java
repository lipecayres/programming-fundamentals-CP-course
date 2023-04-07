
/**
 * Application Purpose: Build a blueprint Employee class - states and behavior
 * Author: Felipe Cayres
 * Date: Apr 4th, 2023
 * Time: 10:50 AM
 */

public class Employee {

    // variables
    private int salary; 
    private int idNumber; 

    // default constructor
    public Employee() {}

    // constructor with arguments
    public Employee(int salary, int idNumber) {
        this.salary = salary;
        this.idNumber = idNumber;
    }

    // getters and setters -> salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    // getters and setters -> idNumber
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

}