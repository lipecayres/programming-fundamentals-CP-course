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

    // getters and setters -> street number
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    // getters and setters -> street name
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetName() {
        return streetName;
    }

    // getters and setters -> street name
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    // getters and setters -> street name
    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

}