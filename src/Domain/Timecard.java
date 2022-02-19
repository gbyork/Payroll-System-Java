/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Database.EmployeeDA;
import Database.PayrollDA;
import Database.TimecardDA;
import Domain.Employee;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rando
 */
public class Timecard {

    public Date Date;
    public int EmployeeID;
    public double HoursWorked;
    public double Overtime;

    public Timecard() {

    }

    public Timecard(Date Date, int EmployeeID, double HoursWorked, double Overtime) {
        this.Date = Date;
        this.EmployeeID = EmployeeID;
        this.HoursWorked = HoursWorked;
        this.Overtime = Overtime;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public double getHoursWorked() {
        return HoursWorked;
    }

    public void setHoursWorked(double HoursWorked) {
        this.HoursWorked = HoursWorked;
    }

    public double getOvertime() {
        return Overtime;
    }
    
    public void setOvertime(double Overtime) {
        this.Overtime = Overtime;
    }
    
    public static ArrayList<Timecard> getTimecard() {
        return TimecardDA.getTimecard();
    }
          //hourlyemployee will call get employeeid
          //timecard da will loop through arraylist of timecards to make another arraylist
          //
    
    //make timecard arraylist
    //assigning timecard to employees
   /* public static double getEmployeeTimecard(double EmployeeID){
          ArrayList<Timecard> Time = Timecard.getTimecard();
          //hourlyemployee will call get employeeid
          //timecard da will loop through arraylist of timecards to make another arraylist
          //
          ArrayList<Employee>Employees = Employee.getEmployees();
          
          for (int i = 0; i < Time.size(); i++) {  
          if (Time.EmployeeID = (Employees.EmployeeID)){   
          
          Employee a;
          a.setHoursWorked(HoursWorked);
          a.setOvertime(Overtime);
          return Employees;
          
          
      }
       
    }
    }
}*/
       // ArrayList<Employee> Employees = Employee.getEmployees();
  
    
    
    /* public static double GrossPayCalculation() {

        
        ArrayList<Timecard> Time = Timecard.getTimecard();
        for (int i = 0; i < Time.size(); i++) {
     //   if (getEmployeeID == employees.getEmployeeID){
        
        }
            
            }
     */
     
    
    //need to link employees and timecard
    //static method getemployee.timecards
     
    @Override
    public String toString() {
        return " Timecard{ " + " Date " + Date + ", HoursWorked= " + HoursWorked + " , EmployeeID= " + EmployeeID + '}';
    }

}
