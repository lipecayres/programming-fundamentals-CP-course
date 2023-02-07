/**	Application Purpose: Test blueprint class
*	Author: Felipe Cayres
*	Date: Feb 07th, 2023
*	Time: 9:46 AM
*/

   // Class declaration
public class Car { 

    // Variables
    private String brand;
    private int year;
    private double price;

        // Declaring empty constructor
    public Car () {}    

        // Behavior - Getters and Setters
    public Car (String brand, int year, double price){
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
        

    // Getters and Setters -> Brand
    public void setBrand (String brand){
        this.brand = brand;
    }

    public String getBrand () {
        return brand;
    }

    // Getters and Setters -> Year
    public void setYear (int year){
        this.year = year;
    }

    public int getYear () {
        return year;
    }

    // Getters and Setters -> Price
    public void setPrice (double price){
        this.price = price;
    }

    public double getPrice () {
        return price;
    }

   // Method to set price after taxes
    public double getPriceAfterTax (){
        double tax = 0.1;
        double priceAfterTax = price + (price * tax);

        return priceAfterTax;                                           
    }
}