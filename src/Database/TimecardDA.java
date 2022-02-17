/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import Domain.Timecard;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author rando
 */
public class TimecardDA {
   public static ArrayList<Timecard> Time = new ArrayList<Timecard>();
    
//started adding timecards
   public static void initialize(){
   
    
       
       Timecard a;
       
       Calendar c = Calendar.getInstance(); 
       
       a= new Timecard();
       c.set(2022,1,12);
       a.setDate(c.getTime());
       a.setEmployeeID(101);
       a.setHoursWorked(8);
       a.setOvertime(0);
       
       Time.add(a);
       a= new Timecard();
   //    a.setDate("2/6/2022");
       a.setEmployeeID(102);
       a.setHoursWorked(8);
       a.setOvertime(0);
       
       
   }
    public static ArrayList<Timecard> getTimecard(){
    return Time;
}
}