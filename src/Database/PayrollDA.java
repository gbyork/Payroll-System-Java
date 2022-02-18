/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Domain.Employee;
import Database.EmployeeDA;
import java.util.ArrayList;
import Domain.Payroll;
import Database.WithholdingDA;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author rando
 */
public class PayrollDA {

    private static ArrayList<Payroll> Payrolls = new ArrayList<Payroll>();

    public static void initialize() {

        Payroll a;
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, 1, 12);
        a = new Payroll();
        a.setDate(calendar.getTime());
        a.setEmployeeID(101);
        a.setTotalDeductions(103.97);    
        //this info should be set by calculation methods if possible NOT SET MANUALLY
        /*a.setGrossPay(100);
       a.setNetPay(100);
       a.setTotalDeductions(103.97);
         */
        Payrolls.add(a);
    }

    public static ArrayList<Payroll> getPayrolls() {
        return Payrolls;

    }

    /*   public String Date;
   public double EmployeeID;
   public double GrossPay;
   public double TotalDeductions;
   public double NetPay;*/
}
