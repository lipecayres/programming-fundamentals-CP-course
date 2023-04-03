
/**
 * Application Purpose: Build a blueprint Real Estate Transaction - states and
 * behavior
 * Author: Felipe Cayres
 * Date: Apr 2nd, 2023
 * Time: 07:55 PM
 */

import java.util.Random;

public class RealEstateTransaction {

    // variables
    private String streetNumber, streetName, city, purchasePrice;

    Random rand = new Random();
    String fullString = (streetNumber + streetName + city + purchasePrice).replaceAll(" ", "");
    int fullStringLength = fullString.length();

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

    // getters and setters -> city
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    // getters and setters -> purchase price
    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    // method 1 - generate state one string
    public void generateStateOneString() {
        
        //get string data
        String fullString = (streetNumber + streetName + city + purchasePrice).replaceAll(" ", "");
        int fullStringLength = fullString.length();
        
        //split string in 2 parts
        String part1 = "", part2 = "";
        for (int i = 0; i < fullStringLength; i++) {

            //append character using string length as paramether
            if (i <= fullStringLength / 2) {
                part1 += fullString.charAt(i);
            } else if (i > fullStringLength / 2) {
                part2 += fullString.charAt(i);
            }
        }
        //print final state
        System.out.println(part1.toLowerCase() + part2.toUpperCase());

    }

    // method 2 - generate random state one string
    public void generateRandomStateOneString() {
        //get string data
        String fullString = (streetNumber + streetName + city + purchasePrice).replaceAll(" ", "");
        int fullStringLength = fullString.length();

        //set random value
        Random rand = new Random();
        int rand1 = 0;

        while (rand1 <= 0) {
            rand1 = rand.nextInt(fullStringLength - 1);
        }

        //split string in 2 parts
        String part1 = "", part2 = "";

        for (int i = 0; i < fullStringLength; i++) {

            //append character using string length as paramether
            if (i < rand1) {
                part1 += fullString.charAt(i);
            } else if (i >= rand1) {
                part2 += fullString.charAt(i);
            }
        }
        //print final state
        System.out.println(part1.toLowerCase() + part2.toUpperCase());
    }

    // method 3 - encrypt string
    public String encryptState(int inKeyCharacterIndex, int firstCharacterIndex) {
        
        //get string data
        String fullString = (streetNumber + streetName + city + purchasePrice).replaceAll(" ", "");
        int fullStringLength = fullString.length();

        // error status - return 1
        if (inKeyCharacterIndex >= fullString.length() || 
            firstCharacterIndex >= fullString.length() || 
            inKeyCharacterIndex >= firstCharacterIndex) {
            return "1";
        }

        //encrypted string data
        StringBuilder encryptedString = new StringBuilder();
        char key = fullString.charAt(inKeyCharacterIndex);
        
        //if statement variable to replace char
        float keyLock;

        for (int i = 0; i<fullStringLength; i++){
            keyLock = (i - firstCharacterIndex) % 3;

            //append character using encrypted paramethers
            if (i == firstCharacterIndex || 
               (i > inKeyCharacterIndex && (keyLock== 0))){
                encryptedString.append(key);
               } else{
                encryptedString.append(fullString.charAt(i));
               }
        }
        // return final string
        return encryptedString.toString();
    }

}