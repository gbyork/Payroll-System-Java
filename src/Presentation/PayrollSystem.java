/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;




import Database.EmployeeDA;
import Database.PayrollDA;
import Database.TimecardDA;
import static Database.TimecardDA.Time;
import Database.WithholdingDA;
import Domain.Employee;
import Domain.Payroll;
import Domain.Timecard;
import java.util.ArrayList;

/**
 *
 * @author rando
 */
public class PayrollSystem {
   //payroll.calculation payroll will be pushed here//
            //BankingSystemDA.initialize();
     
        public static void main(String[] args) {
         EmployeeDA.initialize();
        TimecardDA.initialize();
      //  WithholdingDA.initialize();
      //  PayrollDA.initialize();
        
         ArrayList<Employee>employees;
        
        
      // Printing employee info
        System.out.println(" Inside Payroll System ");
        employees = Employee.getEmployees();
        System.out.println("\nEmployees\n");
        for (int i=0; i<employees.size(); i++){
            System.out.println(employees.get(i));
        }
        //printing out timecard info
            ArrayList<Timecard> Time;
        
        System.out.println(" ");
        Time = Timecard.getTimecard();
        System.out.println("\nTimecard\n");
        for (int i=0; i<Time.size(); i++){
        System.out.println(Time.get(i));
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