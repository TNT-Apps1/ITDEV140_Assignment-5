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
public class Faculty extends CollegeEmployee{
    
        private boolean tenured;

    /**
     * Get the value of tenured
     *
     * @return the value of tenured
     */
    public boolean isTenured() {
        return tenured;
    }

    /**
     * Set the value of tenured
     *
     * @param tenured new value of tenured
     */
    public void setTenured(boolean tenured) {
        this.tenured = tenured;
    }

    @Override
    public void displayAll(){
        System.out.println("\n*******************************************");
        System.out.printf("Name: \t\t%s %s\n", getFirstName(),getLastName());
        System.out.printf("Address: \t%s\n", getStreetAddress());
	System.out.printf("Zip Code: \t%s\n", getZipCode());
        System.out.printf("Phone #: \t%s\n", getPhoneNumber());
        System.out.printf("SSN: \t\t%s\n", getSsn());
        System.out.printf("Department: \t%s\n", getDepartment());
        System.out.printf("Salary: \t%.2f\n", getSalary());
        System.out.printf("Tenured: \t%s\n", tenured);
        System.out.println("*******************************************\n");
    
    }
    
}
