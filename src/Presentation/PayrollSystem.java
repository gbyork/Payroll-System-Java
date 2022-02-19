/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;




import Database.EmployeeDA;
import Database.PayrollDA;
import Database.TimecardDA;
import Database.WithholdingDA;
import Domain.Employee;
import Domain.HourlyEmployee; 
import Domain.Payroll;
import Domain.Timecard;
import java.util.ArrayList;
import Domain.SalaryEmployee;
import java.io.*;
/**
 *
 * @author rando
 */
public class PayrollSystem {
   //payroll.calculation payroll will be pushed here//
            //BankingSystemDA.initialize();
     
        public static void main(String[] args) {
         
        
      //  WithholdingDA.initialize();
      //  PayrollDA.initialize();
        
        ArrayList<Employee>employees;
        ArrayList<Timecard> timecards;
        ArrayList<Payroll> payrolls;
        
        EmployeeDA.initialize();
        TimecardDA.initialize();
        PayrollDA.initialize();
      // Printing employee info
        System.out.println(" Inside Payroll System ");
        employees = Employee.getEmployees();
        timecards = Timecard.getTimecard();
        payrolls = Payroll.getPayrolls();
        for (Employee employee : employees) {
            if (employee instanceof HourlyEmployee) {
                HourlyEmployee he = (HourlyEmployee)employee; 
                he.findTimecard(timecards);
            }
        }
        System.out.println(timecards.size());
        System.out.println("\nEmployees\n");
        for (int i=0; i<employees.size(); i++){
            System.out.println(employees.get(i).toString());
        }
              
        
        
       
       
        }
}

       
  




/* left over code from bankingsystem.java that i deleted
import Database.EmployeeDA;
import java.util.ArrayList;
import Domain.Employee;

public class BankingSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees;
        int i;
        
        //BankingSystemDA.initialize();
        EmployeeDA.initialize();
        System.out.println(" Inside Banking System ");
        
        employees = Employee.getEmployee();
        System.out.println("\nEmployees\n");
        for (i=0; i<employees.size(); i++)
          System.out.println(employees.get(i));
        
    }
}
*/