/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Database.TimecardDA;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author rando
 */
public class Timecard {
    public Date Date;
    public double EmployeeID;
    public double HoursWorked;
    public double Overtime;
   
    public Timecard(){
       
    }
    public Timecard(Date Date, double EmployeeID,double HoursWorked, double Overtime){
    this.Date=Date;
    this.EmployeeID=EmployeeID;
    this.HoursWorked = HoursWorked;
    this.Overtime = Overtime;
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
    public static ArrayList<Timecard>getTimecard(){
    return TimecardDA.getTimecard();
    }
 @Override
    public String toString() {
        return " Timecard{ " + " Date " + Date + ", HoursWorked= " + HoursWorked + " , EmployeeID= " + EmployeeID + '}';
    }

}
