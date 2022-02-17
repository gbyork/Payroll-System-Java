/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Database.EmployeeDA;
import java.util.ArrayList;

/**
 *
 * @author rando
 */

public abstract class Employee {
     public String FirstName;
     public String LastName;
     public double EmployeeID;
     public double SocialSecurityNumber;

     public Employee(){
    
    }

    public Employee(String FirstName, String LastName, double EmployeeID, double SocialSecurityNumber) {
        super();
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.EmployeeID = EmployeeID;
        this.SocialSecurityNumber = SocialSecurityNumber;
   
    }

    public double getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(double EmployeeID) {
        this.EmployeeID = EmployeeID;
    }   

    
    public double getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }



    public void setSocialSecurityNumber(double SocialSecurityNumber) {
        this.SocialSecurityNumber = SocialSecurityNumber;
    }
    
     
     


//    public Employee(String FirstName, String LastName) {
  //      this.FirstName = FirstName;
    //    this.LastName = LastName;
    //}

    
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    
    }
    
    public void setAnnualSalary(double a){}
    
    public double getAnnualSalary(){
        return 0.0;
    }
    
    public void setHourlyRate(double a){}
    
    public double getHourlyrate(){
        return 0.0;
    }
    
    public void setOvertime(double a){}
    
    public double getOvertime(){
        return 0.0;
    }
       
    public static ArrayList<Employee>getEmployees(){
    return EmployeeDA.getEmployees();
    }
    
     @Override
    public String toString() {
        return "Employee{" + "FirstName=" + FirstName + ", lastName=" + LastName + ", EmployeeID=" + EmployeeID + ", SocialSecurityNumber=" + SocialSecurityNumber + '}';
    }
}
