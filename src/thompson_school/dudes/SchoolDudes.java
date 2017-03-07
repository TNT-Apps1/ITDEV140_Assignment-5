/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thompson_school.dudes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Grant Thompson <adin.tocc@gmail.com>
 * ITDEV 140 THUR EVE ASSIGNMENT # 5
 */
public class SchoolDudes {
    
    private final ArrayList<CollegeEmployee> collegeEmployee = new ArrayList<>();
    private final ArrayList<Faculty> faculty = new ArrayList<>();
    private final ArrayList<Student> student = new ArrayList<>();
    private Student student1;
    private Faculty faculty1;
    private CollegeEmployee employee1;
    private final Scanner input = new Scanner(System.in);
    private int tempInt;
    private String tempFirstName, tempLastName, tempStreetAddress, tempZipCode, tempPhoneNumber;
    
    
    
    
    
    
    
    
    public SchoolDudes() {
        dude();
    }//end constructor

    
    
    
    
    
    
    
    private void dude() {
       
        do{// controller loop
        System.out.println("\n\n\nPlease select an action:");
        System.out.println("\t1) Add a person");
        System.out.println("\t2) Find a person");
        System.out.println("\t3) Display All persons");
        System.out.println("\t4) Quit");
        tempInt = input.nextInt();
        input.nextLine();
        switch(tempInt){
            case 1:
                addDude();
                break;
            case 2:
                find();
                break;
            case 3:
                displayAll();
                break;
            
        }
        }while(tempInt!=4);
        
        
    }//end dude
    
    
    
    
    
    
    
    
    
    
    
        
                private void addDude(){// add person to app

                    tempInt=0;

                    System.out.println("\n\n\nIs this person a:");
                    System.out.println("\t1) College Employee");
                    System.out.println("\t2) Faculty Member");
                    System.out.println("\t3) Student");
                    System.out.println("\t4) Quit");
                    tempInt = input.nextInt();
                    input.nextLine();

                            if(tempInt>=4)
                                    return;

                    System.out.printf("Please enter a first name ==> ");
                    tempFirstName= input.nextLine();

                    System.out.printf("Please enter a last name ==> ");
                    tempLastName= input.nextLine();

                    System.out.printf("Please enter a street address ==> ");
                    tempStreetAddress= input.nextLine();

                    System.out.printf("Please enter a zip code ==> ");
                    tempZipCode= input.nextLine();

                    System.out.printf("Please enter a telephone number ==> ");
                    tempPhoneNumber= input.nextLine();



                    switch(tempInt){//switch on user selection
                        case 1://add employee
                            String tempSsn;
                            String tempDepartment;
                            Double tempSalary;

                            System.out.printf("Please enter the employee's SSN ==> ");
                            tempSsn = input.nextLine();
                            System.out.printf("Please enter the employee's department ==> ");
                            tempDepartment = input.nextLine();
                            System.out.printf("Please enter the employee's salary ==> ");
                            tempSalary = input.nextDouble();
                            input.nextLine();
                            employee1 = new CollegeEmployee();
                            employee1.setFirstName(tempFirstName);
                            employee1.setLastName(tempLastName);
                            employee1.setStreetAddress(tempStreetAddress);
                            employee1.setZipCode(tempZipCode);
                            employee1.setPhoneNumber(tempPhoneNumber);
                            employee1.setSsn(tempSsn);
                            employee1.setDepartment(tempDepartment);
                            employee1.setSalary(tempSalary);
                            collegeEmployee.add(employee1);                
                            break;
                        case 2:// add faculty
                            Boolean tempTenured=false;
                            int tenuredNumber;

                            System.out.printf("Please enter the employee's SSN ==> ");
                            tempSsn = input.nextLine();
                            System.out.printf("Please enter the employee's department ==> ");
                            tempDepartment = input.nextLine();
                            System.out.printf("Please enter the employee's salary ==> ");
                            tempSalary = input.nextDouble();
                            input.nextLine();
                            System.out.printf("Is this faculty member tenured? 1=Yes 2=No ==> ");
                            tenuredNumber = input.nextInt();
                            if(tenuredNumber==1)
                                tempTenured=true;
                            input.nextLine();

                            faculty1 = new Faculty();
                            faculty1.setFirstName(tempFirstName);
                            faculty1.setLastName(tempLastName);
                            faculty1.setStreetAddress(tempStreetAddress);
                            faculty1.setZipCode(tempZipCode);
                            faculty1.setPhoneNumber(tempPhoneNumber);
                            faculty1.setSsn(tempSsn);
                            faculty1.setDepartment(tempDepartment);
                            faculty1.setSalary(tempSalary);
                            faculty1.setTenured(tempTenured);
                            faculty.add(faculty1);  
                            break;
                        case 3:// add student
                            String tempMajor;
                            Double tempGpa;
                            System.out.printf("Please enter the student's major ==> ");
                            tempMajor = input.nextLine();
                            System.out.printf("Please enter the student's GPA ==> ");
                            tempGpa = input.nextDouble();
                            student1 = new Student();
                            student1.setFirstName(tempFirstName);
                            student1.setLastName(tempLastName);
                            student1.setStreetAddress(tempStreetAddress);
                            student1.setZipCode(tempZipCode);
                            student1.setPhoneNumber(tempPhoneNumber);
                            student1.setMajor(tempMajor);
                            student1.setGpa(tempGpa);
                            student.add(student1); 
                            break;

                    }

               }//end addDude()
                
                
                
                
                
                
                

                private void find(){// find a person by first name
                    String tempName;


                    System.out.println("\n\n\nPlease enter a last name to find:");
                    tempName = input.nextLine();

                    for (CollegeEmployee collegeEmployee1 : collegeEmployee) {
                        if(collegeEmployee1.getLastName().toLowerCase().equals(tempName.toLowerCase()))
                        collegeEmployee1.displayAll();
                    }

                    for (Faculty faculty11 : faculty) {
                        if(faculty11.getLastName().toLowerCase().equals(tempName.toLowerCase()))
                        faculty11.displayAll();
                    }
                    for (Student student11 : student) {
                        if(student11.getLastName().toLowerCase().equals(tempName.toLowerCase()))
                        student11.displayAll();
                    }
                }//end find()
                
                
                
                
                
                
                
                
                
                
                
        
                
    
                private void displayAll(){// display all persons of a type

                    int tempInt1;

                    System.out.println("\n\n\nSelect a display all person type:");
                    System.out.println("\t1) College Employee");
                    System.out.println("\t2) Faculty Member");
                    System.out.println("\t3) Student");
                    System.out.println("\t4) Quit");
                    tempInt1 = input.nextInt();
                    input.nextLine();

                            if(tempInt1>=4)
                                    return;

                            switch(tempInt1){

                                case 1:
                                    System.out.println("\n\n\n***Displaying all Employees***\n");
                                    for (CollegeEmployee collegeEmployee1 : collegeEmployee) {
                                        collegeEmployee1.displayAll();
                                        }
                                break;

                                case 2:
                                    System.out.println("\n\n\n***Displaying all Faculty***\n");
                                    for (Faculty faculty12 : faculty) {
                                        faculty12.displayAll();
                                        }
                                break;

                                case 3:
                                    System.out.println("\n\n\n***Displaying all Students***\n");
                                    for (Student student12 : student) {
                                        student12.displayAll();
                                        }
                                    break;
                            }//end switch
                        }// end displayAll()

    
    }// end class
