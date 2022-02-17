/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Database.EmployeeDA;
import Database.PayrollDA;
import Database.TimecardDA;
import Database.WithholdingDA;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author rando
 */
public class Payroll {

    public Date Date;
    public double EmployeeID;
    public double GrossPay;
    public double TotalDeductions;
    public double NetPay;

    public Payroll() {

    }

    public Payroll(Date Date, double EmployeeID, double GrossPay, double TotalDeductions, double NetPay) {
        this.Date = Date;
        this.EmployeeID = EmployeeID;
        this.GrossPay = GrossPay;
        this.TotalDeductions = TotalDeductions;
        this.NetPay = NetPay;

    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public double getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(double EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public double getGrossPay() {
        return GrossPay;
    }

    public void setGrossPay(double GrossPay) {
        this.GrossPay = GrossPay;
    }

    public double getTotalDeductions() {
        return TotalDeductions;
    }

    public void setTotalDeductions(double TotalDeductions) {
        this.TotalDeductions = TotalDeductions;
    }

    public double getNetPay() {
        return NetPay;
    }

    public void setNetPay(double NetPay) {
        this.NetPay = NetPay;
    }

    public static ArrayList<Payroll> getPayrolls() {
        return PayrollDA.getPayrolls();
    }
/*
    // calculate payroll in here     
    public static double GrossPayCalculation(Employee employees, Timecard Time) {

        for (int i = 0; i < employees.size(); i++) {
            if (Time.EmployeeID == employees.EmployeeID) {
                return Payroll.setGrossPay() = ((employees.getHourlyrate() * Time.HoursWorked) + (1.5 * employees.getHourlyrate() * employees.getOvertime()));
            }
        }
        return 0;
  

    }
    // netpay = employees[1]

    //going to wait on making all these methods by checking in with strong on this first
    public static double NetPayCalculation(Employee employees, Withholding Withholdings) {
        if ((Withholdings.EmployeeID == employees.EmployeeID)) {
            // return ((employees.));
        }
        return 0;
    }

    //idea for looping through employees and if they match to calculate gross pay */
}

//Create a Payroll class with the attributes: date, employee ID, gross pay, total deductions, and net 
//pay.  Add all of the get and set methods for the attributes.  
