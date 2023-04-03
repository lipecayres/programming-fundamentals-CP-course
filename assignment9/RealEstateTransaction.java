/**
 * Application Purpose: Build a blueprint Real Estate Transaction - states and
 * behavior
 * Author: Felipe Cayres
 * Date: Apr 2nd, 2023
 * Time: 07:55 PM
 */

public class RealEstateTransaction {

    // variables
    private String streetNumber, streetName, city, purchasePrice;

    // default constructor
    public RealEstateTransaction() {
    }

    // constructor with arguments
    public RealEstateTransaction(String streetNumber, String streetName, String city, String purchasePrice) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.purchasePrice = purchasePrice;
        
    }

