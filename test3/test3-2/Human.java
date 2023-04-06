
/**
 * Application Purpose: Build a blueprint Human class - states and behavior
 * Author: Felipe Cayres
 * Date: Apr 4th, 2023
 * Time: 10:30 PM
 */

public class Human {

    // variables
    private String name; 
    private int weight; 
    public static String city = "London";

    // default constructor
    public Human() {}

    // constructor with arguments
    public Human(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    // getters and setters -> name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // getters and setters -> weight
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

}