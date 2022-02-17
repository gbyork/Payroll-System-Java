/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Database.WithholdingDA;
import java.util.ArrayList;

/**
 *
 * @author rando
 */
public class Withholding {
   public double EmployeeID;
   public String Description;
   public double Amount;
   public double Rate;

    public Withholding(){

    }
    public Withholding(double EmployeeID, String Description, double Amount, double Rate){
    this.EmployeeID = EmployeeID;
    this.Description = Description;
    this.Amount = Amount;
    this.Rate = Rate;

    
}

    public double getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(double EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double Rate) {
        this.Rate = Rate;
    }
    public static ArrayList<Withholding>getWithholding(){
    return WithholdingDA.getWithholding();
    }
}
