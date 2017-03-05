/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thompson_school.dudes;

/**
 *
 * @author Grant Thompson <adin.tocc@gmail.com>
 * ITDEV 140 THUR EVE ASSIGNMENT # 5
 */
abstract public class Person {
    
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String phoneNumber;

    /**
     * Get the value of phoneNumber
     *
     * @return the value of phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the value of phoneNumber
     *
     * @param phoneNumber new value of phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    private String zipCode;

    /**
     * Get the value of zipCode
     *
     * @return the value of zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Set the value of zipCode
     *
     * @param zipCode new value of zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Get the value of streetAddress
     *
     * @return the value of streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Set the value of streetAddress
     *
     * @param streetAddress new value of streetAddress
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    

    /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName new value of lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Get the value of firstName
     *
     * @return the value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the value of firstName
     *
     * @param firstName new value of firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void displayAll(){
    System.out.println(firstName);
    System.out.println(lastName);
    System.out.println(streetAddress);
    System.out.println(phoneNumber);
    }

}
