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
public class Student extends Person{
    
        private String major;
    private double gpa;

    /**
     * Get the value of gpa
     *
     * @return the value of gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Set the value of gpa
     *
     * @param gpa new value of gpa
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    /**
     * Get the value of major
     *
     * @return the value of major
     */
    public String getMajor() {
        return major;
    }

    /**
     * Set the value of major
     *
     * @param major new value of major
     */
    public void setMajor(String major) {
        this.major = major;
    }
    
    
        @Override
    public void displayAll(){
        
            System.out.println("\n*******************************************");
            System.out.printf("Name: \t\t%s %s\n", getFirstName(),getLastName());
            System.out.printf("Address: \t%s\n", getStreetAddress());
			System.out.printf("Zip Code: \t%s", getZipCode());
            System.out.printf("Phone #: \t%s\n", getPhoneNumber());
            System.out.printf("Major: \t\t%s\n", major);
            System.out.printf("GPA: \t\t%.2f\n", gpa);
            System.out.println("*******************************************\n");
    }

}
