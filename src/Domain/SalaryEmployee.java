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


public class SalaryEmployee extends Employee{

    public double AnnualSalary;

    public SalaryEmployee(){
        
    }
     public SalaryEmployee(String FirstName,String LastName, double EmployeeID, double SocialSecurityNumber,double AnnualSalary){
        super(FirstName,LastName,EmployeeID,SocialSecurityNumber);
        this.AnnualSalary = AnnualSalary;
    }

     
     
    public double getAnnualSalary() {
        return AnnualSalary;
    }

    public void setAnnualSalary(double AnnualSalary) {
        this.AnnualSalary = AnnualSalary;
    }
   
    @Override
    public String toString() {
        return " SalaryEmployee{ " + " FirstName= " + FirstName + ", lastName= " + LastName + " , EmployeeID= " + EmployeeID + ", SocialSecurityNumber= " + SocialSecurityNumber + " AnnualSalary= " + AnnualSalary + '}';
    }


}
