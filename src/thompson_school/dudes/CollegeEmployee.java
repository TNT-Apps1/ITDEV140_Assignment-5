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
public class CollegeEmployee extends Person{
    
    private String ssn;
    private String department;
    private Double salary;

    /**
     * Get the value of salary
     *
     * @return the value of salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Set the value of salary
     *
     * @param salary new value of salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }


    /**
     * Get the value of department
     *
     * @return the value of department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Set the value of department
     *
     * @param department new value of department
     */
    public void setDepartment(String department) {
        this.department = department;
    }


    /**
     * Get the value of ssn
     *
     * @return the value of ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Set the value of ssn
     *
     * @param ssn new value of ssn
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
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
        System.out.println("*******************************************\n");
    
    }

    
}
