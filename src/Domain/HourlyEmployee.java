/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import static Database.TimecardDA.Time;
import java.util.Date;

/**
 *
 * @author rando
 */
public class HourlyEmployee extends Employee {

    private double HourlyRate;
    private double Overtime;

    public HourlyEmployee() {

    }

    public HourlyEmployee(String FirstName, String LastName, double EmployeeID, double SocialSecurityNumber, double HourlyRate, double Overtime) {
        super(FirstName, LastName, EmployeeID, SocialSecurityNumber);
        this.HourlyRate = HourlyRate;
        this.Overtime = Overtime;
    }

    public double getHourlyRate() {
        return HourlyRate;
    }

    public void setHourlyRate(double HourlyRate) {
        this.HourlyRate = HourlyRate;
    }

    public double getOvertime() {
        return Overtime;
    }

    public void setOvertime(double Overtime) {
        this.Overtime = Overtime;
    }
    
    @Override
    public double CalculateGrossPay(Date Date){
    return (HourlyRate*HoursWorked) + (1.5 * HourlyRate * Overtime);
    }
    
    
    @Override
    public String toString() {
        return " HourlyEmployee{ " + " FirstName= " + FirstName + ", lastName= " + LastName + ", EmployeeID= " + EmployeeID + " , SocialSecurityNumber= " + SocialSecurityNumber + " HourlyRate= " + HourlyRate + " Overtime= " + Overtime + '}';
    }
    // get timecard and add up the hours here
    // need to link timecard with employees before this works
    
}
    
// Hourly Employee will have the attributes: hourly rate and 
//overtime rate. Add the get and set methods for each attribute.
