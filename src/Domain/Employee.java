/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Database.EmployeeDA;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rando
 */
public abstract class Employee {

    public String FirstName;
    public String LastName;
    public int EmployeeID;
    public double SocialSecurityNumber;
    public Payroll EmployeePayroll;
    
    public Employee() {

    }

    public Employee(String FirstName, String LastName, int EmployeeID, double SocialSecurityNumber) {
        super();
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.EmployeeID = EmployeeID;
        this.SocialSecurityNumber = SocialSecurityNumber;

    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
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

    public void setAnnualSalary(double a) {
    }

    public double getAnnualSalary() {
        return 0.0;
    }

    public void setHourlyRate(double a) {
    }

    public double getHourlyrate() {
        return 0.0;
    }

    public void setOvertime(double a) {
    }

    public double getOvertime() {
        return 0.0;
    }
    
    public static ArrayList<Employee> getEmployees() {
        return EmployeeDA.getEmployees();
    }
    
    public double CalculateGrossPay(Date Date){
        return 0.0;
    }
     
    //calculategrosspay will be polymorphic
       
    //Calculate GrossPay
    

    // Calculategrosspay (Date Date)
    // return 0.0
    
    
    @Override
    public String toString() {
        String result = "";
        //result += "Employee{" + "FirstName=" + FirstName + ", lastName=" + LastName + ", EmployeeID=" + EmployeeID + ", SocialSecurityNumber=" + SocialSecurityNumber; 
        String employeeType = this instanceof SalaryEmployee ? "Salary" : "Hourly";
        
            result += "\n";
            result += "****************" + this.FirstName +" " + this.LastName +"*******************\n\n";
            result += "Employee Type: " + employeeType + "\n"; 
            result += "Employee ID: " + this.EmployeeID + "\n";
        if (this instanceof SalaryEmployee) {
            SalaryEmployee se = (SalaryEmployee)this; 
            result += "Annual Salary: " + se.getAnnualSalary() + "\n";
        }
        else if (this instanceof HourlyEmployee) {
            HourlyEmployee he = (HourlyEmployee)this;
            result += "Hours Worked: " + he.getTimeCard().HoursWorked + "\n";
            result += "Gross Pay: " + he.CalculateGrossPay() + "\n";
        }
        else {}
        result += "\n*****************************************************\n";
        return result; 
    }
}

