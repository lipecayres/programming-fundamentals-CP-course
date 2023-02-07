/**	Application Purpose: Test - Second class  
*	Author: Felipe Cayres
*	Date: Feb 07th, 2023
*	Time: 09:58 PM
*/

public class TestCar {                              // Class declaration
    
    public static void main (String [] args) {      //Main method


        // Declaring the first car data
        Car car1 = new Car("Ford", 2020, 15000);

        System.out.println();       // Jumping line - better visualization
        System.out.println("Car Informations:");
        System.out.println("--- " + "Brand: " + car1.getBrand());
        System.out.println("--- " +"Year: " + car1.getYear());
        System.out.println("--- " +"Price: $" + car1.getPrice());
        System.out.println();       // Jumping line - better visualization
   
            // Default constructor 2
        Car car2 = new Car();

        // Updating brand
        car2.setBrand("Fiat");

        // Updating Year
        car2.setYear(2023);

        // Updating Price
        car2.setPrice(12000);


        // Printing car informations after update.        
        System.out.println();                   // Jumping line - better visualization
        System.out.println("Car Informations:");
        System.out.println("--- " + "Brand: " + car2.getBrand());
        System.out.println("--- " +"Year: " + car2.getYear());
        System.out.println("--- " +"Price: $" + car2.getPrice());
        System.out.println();                   // Jumping line - better visualization

        System.out.println();                   // Jumping line - better visualization
        System.out.println("--- " + "Price after tax: " + car2.getPriceAfterTax());
    }

}
